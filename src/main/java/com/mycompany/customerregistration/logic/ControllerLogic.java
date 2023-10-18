package com.mycompany.customerregistration.logic;

import com.mycompany.customerregistration.persistence.ControllerPersistence;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class ControllerLogic {
    
    ControllerPersistence controllerPersistence;
    
    SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy"); 
    
    public ControllerLogic() {
        
        controllerPersistence = new ControllerPersistence ();
        
    }

    
    // User's methods
    
    public String checkUserSignUp(String user, String password) {
        
        String message = "User and password don´t exist" ;
       
        List<User> listUser = controllerPersistence.findUser();
        
        for (User u : listUser ) {
                
            if ( u.getUsername().equals(user) &&  u.getPassword().equals(password)  )   {
                message= "User and password exist" ;       
            }else if (  u.getUsername().equals(user)  ) {
                 message= "User exists" ; 
            }else if (  u.getPassword().equals(password)  ) {
                message= "Password exists" ; 
            } 
                  
        }       
        
        return message ; 
              
        
    }

    public void createUser(String user, String password) {
        
         User u = new  User();
         u.setUsername(user);
         u.setPassword(password);
         
         controllerPersistence.create( u );
        
    }

    public String checkUser(String user, String password) {
       
        String message = "User not found" ; 
       
        List<User> listUser = controllerPersistence.findUser();
        
        for (User u : listUser ) {
            
            if ( u.getUsername().equals(user)   )   {
               
                if ( u.getPassword().equals(password)  )   {
                   message= "User and password correct" ; 
                   return message ;
               }
                else {
                    message= "Password incorrect" ; 
                    return message ;
               }
            } 
            
            else {
                  message= "User not found" ;   
            }
            
        }
        
        return message ;
        
    }

    // Customer's methods
    
    public void createCustomer(String name, String identification, 
            String maritalStatus, char gender, String birth) {
        
         try {  
             
                Customer customer = new  Customer();
                
                customer.setName(name);
                customer.setIdentification(identification);
                customer.setMaritalstatus(maritalStatus);
                customer.setGender(gender);

                Date birthDate = sdf.parse(  birth  ) ;
                customer.setBirth(birthDate);
                
                controllerPersistence.createCustomer( customer );


                }catch (ParseException e){
                    System.out.println("error " + e.getMessage() ) ; 
            }  
         }

    
    public int checkIdentification(String identification) {
        
        int num = 0;
        
        List<Customer> listCustomer = controllerPersistence.findCustomer();
        
        for ( Customer c : listCustomer ) {
             
            if ( c.getIdentification().equals(identification) )   {
                
                num = c.getId() ;
             }
                       
        }
        
        return num  ;
        
    }
    
    public void removeCustomer(int id) {
        
       controllerPersistence.removeCustomer(id);
        
    }

    public List<Customer> showCustomer() {
        
        return controllerPersistence.findCustomer();
        
    }
    
     public void editCustomer(Customer customer, String name, String identification, String maritalStatus, char gender, String birth) {
        
          try {
            
            customer.setName(name);
            customer.setIdentification(identification);
            customer.setMaritalstatus(maritalStatus);
            customer.setGender(gender);
           
            Date birthDate = sdf.parse(  birth  ) ;
            customer.setBirth(birthDate);    
            
            controllerPersistence.editCustomer( customer );
            
            }catch (ParseException e){
            
                System.out.println("error " + e.getMessage() ) ; 
            }  
        
    }


    public Customer findCustumer(int id) {
        
        return controllerPersistence.findCustomer(id);
        
    }
    
    

    // Phone's methods
    
    public void createPhone(int dd, int number, int id) {
        
        Phone phone = new  Phone();
        
        phone.setDd(dd);
        phone.setNumber(number);
        phone.setCustomerId(  controllerPersistence.findCustomer( id )  ) ;
        
        controllerPersistence.CreatePhone( phone );
        
    }
    
    public List<Phone> showPhones() {
        
        return controllerPersistence.showsPhones();
        
    }
    
    public Phone findPhone(int idPhone) {
        
        return controllerPersistence.findPhone(idPhone);
        
    }

    public void editPhone(int id, int idPhone, int dd, int number) {
        
        Phone phone = new  Phone();
        
        phone.setId(idPhone);
        phone.setDd(dd);
        phone.setNumber(number);
        phone.setCustomerId(  controllerPersistence.findCustomer( id )  ) ;
        
        controllerPersistence.editPhone( phone );
        
    }
    
    // Address's methods
    
    public void createAddress(String street, String city, int id) {
        
        Address address = new  Address();
        
        address.setStreet(street);
        address.setCity(city);
        address.setCustomerId( controllerPersistence.findCustomer( id ) );
        
        controllerPersistence.createAddress( address );
        
    }    

    public List<Address> showAddress() {
        
        return controllerPersistence.showsAddress();
        
    }

    public Address findAddress(int idAddress) {
        
        return controllerPersistence.findAddress(idAddress);
        
    }

    public void editAddress(int id, int idAddress, String street, String city) {
       
        Address address = new Address();
        
        address.setId(idAddress);
        address.setStreet(street);
        address.setCity(city);
        address.setCustomerId(  controllerPersistence.findCustomer( id )  ) ;
        
        controllerPersistence.editAddress( address );
        
    }

    
 }
    

