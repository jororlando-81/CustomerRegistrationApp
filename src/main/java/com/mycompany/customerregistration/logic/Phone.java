package com.mycompany.customerregistration.logic;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Phone {
    
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Integer id;
    
    private Integer dd;
    private Integer number;
 
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Customer" , referencedColumnName = "id" )
    private Customer customerId;

    public Phone() {
    }

    public Phone(Integer id, Integer dd, Integer number, Customer customerId) {
        this.id = id;
        this.dd = dd;
        this.number = number;
        this.customerId = customerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDd() {
        return dd;
    }

    public void setDd(Integer dd) {
        this.dd = dd;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }
    
    
    
}
