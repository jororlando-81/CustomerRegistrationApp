package com.mycompany.customerregistration.persistence;

import com.mycompany.customerregistration.logic.Address;
import com.mycompany.customerregistration.logic.Customer;
import com.mycompany.customerregistration.logic.Phone;
import com.mycompany.customerregistration.logic.User;
import com.mycompany.customerregistration.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControllerPersistence {
    
    UserJpaController useJpa = new UserJpaController () ;
    AddressJpaController addressJpa = new  AddressJpaController () ;
    CustomerJpaController customerJpa = new  CustomerJpaController () ;
    PhoneJpaController phoneJpa = new  PhoneJpaController () ;

    
    // User's methods
    
    public List<User> findUser() {
        
         return useJpa.findUserEntities() ;
        
    }

    public void create(User u) {
        
        useJpa.create(u);
        
    }

    // Customer's methods
    
    public void createCustomer(Customer customer) {
        
         customerJpa.create(customer);
        
    }

    
    public List<Customer> findCustomer() {
        
        return customerJpa.findCustomerEntities() ;
        
    }

    public Customer findCustomer(int id) {
        
        return customerJpa.findCustomer(id) ;
    }

    public void removeCustomer(int id) {
        
         try {
            customerJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void editCustomer(Customer customer) {
        
         try {
           
             customerJpa.edit(customer);
        
         } catch (Exception ex) {
         
             Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    // Phone's methods
    
    
    public void CreatePhone(Phone phone) {
       
        phoneJpa.create(phone);
    }

    public List<Phone> showsPhones() {
        
        return phoneJpa.findPhoneEntities();
    }
    
    public Phone findPhone(int idPhone) {
        
        return phoneJpa.findPhone(idPhone) ;
         
    }
    
    public void editPhone(Phone phone) {
        
        try {
           
            phoneJpa.edit(phone);
        
        } catch (Exception ex) {
            
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
     
    // Address's methods
    
    
    public void createAddress(Address address) {
        
        addressJpa.create(address);
        
    }

    public List<Address> showsAddress() {
        
        return addressJpa.findAddressEntities();
        
    }

    public Address findAddress(int idAddress) {
        
        return addressJpa.findAddress(idAddress) ;
        
    }

    public void editAddress(Address address) {
        
        try {
            
            addressJpa.edit(address);
            
        } catch (Exception ex) {
            
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 
    
}
