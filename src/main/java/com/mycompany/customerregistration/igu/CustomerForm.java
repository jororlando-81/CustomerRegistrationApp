package com.mycompany.customerregistration.igu;


import com.mycompany.customerregistration.logic.ControllerLogic;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class CustomerForm extends javax.swing.JFrame {

    ControllerLogic controller;
    
    SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy"); 
   
    public CustomerForm() {
        
        initComponents();
        
        controller = new ControllerLogic();
        
        lbWarning.setVisible(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtIdentification = new javax.swing.JTextField();
        cmbMaritalStatus = new javax.swing.JComboBox<>();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        dcBirth = new com.toedter.calendar.JDateChooser();
        lbWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Customer Form");

        jLabel2.setText("Name (*) ");

        jLabel3.setText("Identification (*) ");

        jLabel4.setText("Marital status (*) ");

        jLabel5.setText("Gender (*) ");

        jLabel6.setText("Birth (*) ");

        btnClear.setText("Clear all the fields");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        txtIdentification.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdentificationFocusLost(evt);
            }
        });

        cmbMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - - - - - - - - -", "Single", "Married", "Widowed", "Divorced" }));

        btnGroup.add(rbMale);
        rbMale.setText("Male");

        btnGroup.add(rbFemale);
        rbFemale.setText("Female");

        dcBirth.setDateFormatString("dd-MM-yyyy");

        lbWarning.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbWarning.setForeground(new java.awt.Color(204, 0, 0));
        lbWarning.setText("This field is required (*) ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbFemale))
                                    .addComponent(cmbMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName)
                                    .addComponent(txtIdentification)
                                    .addComponent(dcBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbWarning)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbWarning))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dcBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear)
                    .addComponent(btnSubmit))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        txtName.setText("");
        txtIdentification.setText("");
        cmbMaritalStatus.setSelectedIndex(0);
        btnGroup.clearSelection();
        dcBirth.setCalendar(null);
              
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        try {
              
                Character gender = ' ';

                if ( rbMale.isSelected() ) {
                     gender = 'M' ;
                }else if( rbFemale.isSelected() ) {
                    gender = 'F' ;
                }
        
                String name = txtName.getText()  ;
                String identification =  txtIdentification.getText() ;
                String maritalStatus = cmbMaritalStatus.getSelectedItem().toString();
              
                String birth = sdf.format( dcBirth.getDate()  );
        
                boolean resultCheck = checkInput ( name , identification , maritalStatus , gender ) ;               
        
        if ( resultCheck ) {
             
                JOptionPane.showMessageDialog(this, "Please complete all fields" , "Error" , JOptionPane.WARNING_MESSAGE );
       
                lbWarning.setVisible(true);
                     
         }else{
            
                int resultCheckIdentification  = controller.checkIdentification( identification );
            
                if ( resultCheckIdentification == 0 ) {
                
                    controller.createCustomer( name  , identification , maritalStatus , gender , birth );

                    JOptionPane.showMessageDialog( null ,  "Save");

                    PhoneForm phone = new  PhoneForm ();
                    phone.setVisible(true);
                    phone.setLocationRelativeTo(null) ;
                    this.dispose();
                
                }else{
                    
                    JOptionPane.showMessageDialog( this , "This identification exists" , "Error" , JOptionPane.WARNING_MESSAGE );
                    
                } 
            } 
        
        }catch ( NullPointerException e){
            JOptionPane.showMessageDialog( null , "Date field must be completed" ); 
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog( null , "Something went wrong, check if all form fields are filled in correctly" );   
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        
        if ( txtName.getText().trim().isEmpty() ) {
            
            lbWarning.setVisible(true);
        
        } else{
           
            lbWarning.setVisible(false);
        }
        
    }//GEN-LAST:event_txtNameFocusLost

    private void txtIdentificationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdentificationFocusLost
        
        if ( txtIdentification.getText().trim().isEmpty() ) {
            
            lbWarning.setVisible(true);
        
        } else{
           
            lbWarning.setVisible(false);
        }
    }//GEN-LAST:event_txtIdentificationFocusLost

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbMaritalStatus;
    private com.toedter.calendar.JDateChooser dcBirth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbWarning;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtIdentification;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private boolean checkInput( String name , String identification , 
            String maritalStatus , Character gender ) {
        
        if ( name.trim().isEmpty()  || identification.trim().isEmpty() || 
            maritalStatus.equals("- - - - - - - - - - -") ||  
                gender.equals(' ') ) {
            
            return true ;
       
        }else{
        
            return false ;
        }
    }
}