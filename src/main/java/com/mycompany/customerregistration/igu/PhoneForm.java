package com.mycompany.customerregistration.igu;


import com.mycompany.customerregistration.logic.ControllerLogic;
import javax.swing.JOptionPane;


public class PhoneForm extends javax.swing.JFrame {

    ControllerLogic controller;
    
    int counter = 0 ;
    
    public PhoneForm() {
       
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
        txtDD = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtIdentification = new javax.swing.JTextField();
        btnAddress = new javax.swing.JButton();
        lbWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Phone form  ( Two phones are required )");

        jLabel2.setText("DD (*) ");

        jLabel3.setText("Number (*) ");

        txtDD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDDFocusLost(evt);
            }
        });

        txtNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumberFocusLost(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel4.setText("Identification (*) ");

        txtIdentification.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdentificationFocusLost(evt);
            }
        });

        btnAddress.setText("Address");
        btnAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressActionPerformed(evt);
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
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDD, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSubmit)
                                    .addComponent(txtIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddress)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lbWarning)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbWarning))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnAddress)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        try {
        
            String dd = txtDD.getText();
            String identification = txtIdentification.getText() ;
            String number = txtNumber.getText() ;
            
            boolean resultCheck = checkInput ( dd , identification , number ) ;     
            
            if ( resultCheck ) {
            
                JOptionPane.showMessageDialog(this, "Please complete all fields" , "Error" , JOptionPane.WARNING_MESSAGE );
       
                lbWarning.setVisible(true);
            
            }else {
            
                    int ddToInt   = Integer.parseInt( dd  ) ;
                    int numberToInt = Integer.parseInt( number ) ;
                   
                    int id  = controller.checkIdentification( identification );
        
                    if ( id != 0 ) { 
                  
                                    controller.createPhone(  ddToInt , numberToInt , id ) ; 

                                    txtDD.setText("");
                                    txtNumber.setText("");

                                    counter++ ;

                                    JOptionPane.showMessageDialog( null , counter + " phone saved successfully " );  

                    } else{ 
       
                             JOptionPane.showMessageDialog( null , "Identification not found"); 
            
                            }
                }  
        
        }catch (NumberFormatException e) {
            
                             JOptionPane.showMessageDialog( null , "Check your typing, you entered a letter in a number field" );   
            
                            }
        
        catch (Exception e) {
            
                            JOptionPane.showMessageDialog( null , "Something went wrong, check if all form fields are filled in correctly" );   
            
                             }
     }

    

    private boolean checkInput(String dd, String identification, String number) {
       
        if ( dd.trim().isEmpty() || identification.trim().isEmpty()  
                || number.trim().isEmpty() ) {
            
            return true ;
       
        }else{
        
            return false ;
        }
                                
    }//GEN-LAST:event_btnSubmitActionPerformed
   
    private void btnAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressActionPerformed
        
            if ( counter ==  2 ) { 
        
            AddressForm address = new  AddressForm ();
            address.setVisible(true);
            address.setLocationRelativeTo(null) ;
            this.dispose();    
            
            }else{
                
                JOptionPane.showMessageDialog(this, "The telephone field must be completed first" , "Error" , JOptionPane.WARNING_MESSAGE );
            }  
    }//GEN-LAST:event_btnAddressActionPerformed

    private void txtDDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDDFocusLost
        
        if ( txtDD.getText().trim().isEmpty() ) {
            
            lbWarning.setVisible(true);
        
        } else{
           
            lbWarning.setVisible(false);
        }
        
    }//GEN-LAST:event_txtDDFocusLost

    private void txtNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumberFocusLost
        
        if ( txtNumber.getText().trim().isEmpty() ) {
            
            lbWarning.setVisible(true);
        
        } else{
           
            lbWarning.setVisible(false);
        }
        
    }//GEN-LAST:event_txtNumberFocusLost

    private void txtIdentificationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdentificationFocusLost
        
        if ( txtIdentification.getText().trim().isEmpty() ) {
            
            lbWarning.setVisible(true);
        
        } else{
           
            lbWarning.setVisible(false);
        }
        
    }//GEN-LAST:event_txtIdentificationFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddress;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbWarning;
    private javax.swing.JTextField txtDD;
    private javax.swing.JTextField txtIdentification;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
