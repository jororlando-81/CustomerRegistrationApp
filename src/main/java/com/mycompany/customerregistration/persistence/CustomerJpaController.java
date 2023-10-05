package com.mycompany.customerregistration.persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.customerregistration.logic.Address;
import com.mycompany.customerregistration.logic.Customer;
import com.mycompany.customerregistration.logic.Phone;
import com.mycompany.customerregistration.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CustomerJpaController implements Serializable {

    public CustomerJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public CustomerJpaController() {
        emf = Persistence.createEntityManagerFactory("CustomerRegistrationPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Customer customer) {
        if (customer.getPhoneList() == null) {
            customer.setPhoneList(new ArrayList<Phone>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Address address = customer.getAddress();
            if (address != null) {
                address = em.getReference(address.getClass(), address.getId());
                customer.setAddress(address);
            }
            List<Phone> attachedPhoneList = new ArrayList<Phone>();
            for (Phone phoneListPhoneToAttach : customer.getPhoneList()) {
                phoneListPhoneToAttach = em.getReference(phoneListPhoneToAttach.getClass(), phoneListPhoneToAttach.getId());
                attachedPhoneList.add(phoneListPhoneToAttach);
            }
            customer.setPhoneList(attachedPhoneList);
            em.persist(customer);
            if (address != null) {
                Customer oldCustomerIdOfAddress = address.getCustomerId();
                if (oldCustomerIdOfAddress != null) {
                    oldCustomerIdOfAddress.setAddress(null);
                    oldCustomerIdOfAddress = em.merge(oldCustomerIdOfAddress);
                }
                address.setCustomerId(customer);
                address = em.merge(address);
            }
            for (Phone phoneListPhone : customer.getPhoneList()) {
                Customer oldCustomerIdOfPhoneListPhone = phoneListPhone.getCustomerId();
                phoneListPhone.setCustomerId(customer);
                phoneListPhone = em.merge(phoneListPhone);
                if (oldCustomerIdOfPhoneListPhone != null) {
                    oldCustomerIdOfPhoneListPhone.getPhoneList().remove(phoneListPhone);
                    oldCustomerIdOfPhoneListPhone = em.merge(oldCustomerIdOfPhoneListPhone);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Customer customer) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Customer persistentCustomer = em.find(Customer.class, customer.getId());
            Address addressOld = persistentCustomer.getAddress();
            Address addressNew = customer.getAddress();
            List<Phone> phoneListOld = persistentCustomer.getPhoneList();
            List<Phone> phoneListNew = customer.getPhoneList();
            if (addressNew != null) {
                addressNew = em.getReference(addressNew.getClass(), addressNew.getId());
                customer.setAddress(addressNew);
            }
            List<Phone> attachedPhoneListNew = new ArrayList<Phone>();
            for (Phone phoneListNewPhoneToAttach : phoneListNew) {
                phoneListNewPhoneToAttach = em.getReference(phoneListNewPhoneToAttach.getClass(), phoneListNewPhoneToAttach.getId());
                attachedPhoneListNew.add(phoneListNewPhoneToAttach);
            }
            phoneListNew = attachedPhoneListNew;
            customer.setPhoneList(phoneListNew);
            customer = em.merge(customer);
            if (addressOld != null && !addressOld.equals(addressNew)) {
                addressOld.setCustomerId(null);
                addressOld = em.merge(addressOld);
            }
            if (addressNew != null && !addressNew.equals(addressOld)) {
                Customer oldCustomerIdOfAddress = addressNew.getCustomerId();
                if (oldCustomerIdOfAddress != null) {
                    oldCustomerIdOfAddress.setAddress(null);
                    oldCustomerIdOfAddress = em.merge(oldCustomerIdOfAddress);
                }
                addressNew.setCustomerId(customer);
                addressNew = em.merge(addressNew);
            }
            for (Phone phoneListOldPhone : phoneListOld) {
                if (!phoneListNew.contains(phoneListOldPhone)) {
                    phoneListOldPhone.setCustomerId(null);
                    phoneListOldPhone = em.merge(phoneListOldPhone);
                }
            }
            for (Phone phoneListNewPhone : phoneListNew) {
                if (!phoneListOld.contains(phoneListNewPhone)) {
                    Customer oldCustomerIdOfPhoneListNewPhone = phoneListNewPhone.getCustomerId();
                    phoneListNewPhone.setCustomerId(customer);
                    phoneListNewPhone = em.merge(phoneListNewPhone);
                    if (oldCustomerIdOfPhoneListNewPhone != null && !oldCustomerIdOfPhoneListNewPhone.equals(customer)) {
                        oldCustomerIdOfPhoneListNewPhone.getPhoneList().remove(phoneListNewPhone);
                        oldCustomerIdOfPhoneListNewPhone = em.merge(oldCustomerIdOfPhoneListNewPhone);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = customer.getId();
                if (findCustomer(id) == null) {
                    throw new NonexistentEntityException("The customer with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Customer customer;
            try {
                customer = em.getReference(Customer.class, id);
                customer.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The customer with id " + id + " no longer exists.", enfe);
            }
            Address address = customer.getAddress();
            if (address != null) {
                address.setCustomerId(null);
                address = em.merge(address);
            }
            List<Phone> phoneList = customer.getPhoneList();
            for (Phone phoneListPhone : phoneList) {
                phoneListPhone.setCustomerId(null);
                phoneListPhone = em.merge(phoneListPhone);
            }
            em.remove(customer);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Customer> findCustomerEntities() {
        return findCustomerEntities(true, -1, -1);
    }

    public List<Customer> findCustomerEntities(int maxResults, int firstResult) {
        return findCustomerEntities(false, maxResults, firstResult);
    }

    private List<Customer> findCustomerEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Customer.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Customer findCustomer(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Customer.class, id);
        } finally {
            em.close();
        }
    }

    public int getCustomerCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Customer> rt = cq.from(Customer.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
