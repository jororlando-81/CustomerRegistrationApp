package com.mycompany.customerregistration.logic;

import com.mycompany.customerregistration.persistence.ControllerPersistence;


public class ControllerLogic {
    
    ControllerPersistence controllerPersistence;
    
    public ControllerLogic() {
        
        controllerPersistence = new ControllerPersistence ();
        
    }
    
}
