package com.mycompany.customerregistration.logic;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Customer {
    
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Integer id;
    
    private String name;
    private String identification;
    private String maritalstatus;
    private Character gender;  
    
    @Temporal(TemporalType.DATE)
    private Date birth;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "customerId")
    private Address address;
    
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "customerId")
    private List<Phone> phoneList;

    public Customer() {
    }

    public Customer(Integer id, String name, String identification, String maritalstatus, Character gender, Date birth, Address address, List<Phone> phoneList) {
        this.id = id;
        this.name = name;
        this.identification = identification;
        this.maritalstatus = maritalstatus;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
        this.phoneList = phoneList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }
    
    
    
}
