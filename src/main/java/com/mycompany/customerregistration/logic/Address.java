package com.mycompany.customerregistration.logic;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {
    
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Integer id;
    
    private String street;
    private String city;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_customer", referencedColumnName = "id")
    private Customer customerId;

    public Address() {
    }

    public Address(Integer id, String street, String city, Customer customerId) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.customerId = customerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }
    
    
    
    
    
}
