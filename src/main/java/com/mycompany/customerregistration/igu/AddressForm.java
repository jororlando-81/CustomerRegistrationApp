package com.mycompany.customerregistration.igu;

import com.mycompany.customerregistration.logic.ControllerLogic;
import javax.swing.JOptionPane;


public class AddressForm extends javax.swing.JFrame {

    ControllerLogic controller;
      
    public AddressForm() {
       
        initComponents();
        
        controller = new ControllerLogic();
        
        lbWarning.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdentification = new javax.swing.JTextField();
        lbWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Address form");

        jLabel2.setText("Street");

        jLabel3.setText("City");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtStreet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStreetFocusLost(evt);
            }
        });

        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });

        jLabel4.setText("Identification");

        txtIdentification.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdentificationFocusLost(evt);
            }
        });

        lbWarning.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbWarning.setForeground(new java.awt.Color(204, 0, 0));
        lbWarning.setText("This field is required (*) ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                            .addComponent(txtIdentification)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19)
                        .addComponent(lbWarning))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnSubmit)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbWarning))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        try {
        
            String street = txtStreet.getText() ;
            String city = txtCity.getText() ;
            String identification = txtIdentification.getText() ;   
        
            boolean resultCheck = checkInput ( street ,  city , identification ) ;  
            
            if ( resultCheck ) {
                
                        JOptionPane.showMessageDialog(this, "Please complete all fields" , "Error" , JOptionPane.WARNING_MESSAGE );
       
                        lbWarning.setVisible(true);
            
            }else {
                    
                   int id  = controller.checkIdentification( identification );
            
                   if ( id != 0 ) { 
            
                        controller.createAddress( street , city , id );
                       
                        JOptionPane.showMessageDialog( null , "Save");  
        
                        Menu menu = new Menu();
                        menu.setVisible(true);
                        menu.setLocationRelativeTo(null);
                        this.dispose();
            
                    }else{ 
            
                        JOptionPane.showMessageDialog( null , "Identification not found");
            
                        }
                }
        
        }catch (Exception e) {
                
                JOptionPane.showMessageDialog( null , "Something went wrong, check if all form fields are filled in correctly" );   
        }      
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtStreetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStreetFocusLost
        
        if ( txtStreet.getText().trim().isEmpty() ) {
            
            lbWarning.setVisible(true);
        
        } else{
           
            lbWarning.setVisible(false);
        }
        
    }//GEN-LAST:event_txtStreetFocusLost

    private void txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusLost
        
        if ( txtCity.getText().trim().isEmpty() ) {
            
            lbWarning.setVisible(true);
        
        } else{
           
            lbWarning.setVisible(false);
        }
        
    }//GEN-LAST:event_txtCityFocusLost

    private void txtIdentificationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdentificationFocusLost
        
        if ( txtIdentification.getText().trim().isEmpty() ) {
            
            lbWarning.setVisible(true);
        
        } else{
           
            lbWarning.setVisible(false);
        }
        
    }//GEN-LAST:event_txtIdentificationFocusLost

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbWarning;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtIdentification;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables

    private boolean checkInput(String street, String city, String identification) {
        
        if ( street.trim().isEmpty() || city.trim().isEmpty()  
                || identification.trim().isEmpty() ) {
            
            return true ;
       
        }else{
        
            return false ;
        }
    }
}
