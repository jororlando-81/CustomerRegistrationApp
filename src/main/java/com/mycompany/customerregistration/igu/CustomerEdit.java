package com.mycompany.customerregistration.igu;


import com.mycompany.customerregistration.logic.ControllerLogic;
import com.mycompany.customerregistration.logic.Customer;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class CustomerEdit extends javax.swing.JFrame {

    ControllerLogic controller = null;
    
    SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy"); 
    
    int id ;
    
    Customer  customer ; 
    
    public CustomerEdit( int id ) {
           
        this.id = id ;
        
        controller = new ControllerLogic();
        
        initComponents();
        
        loadData( id );
        
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
        btnContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Editing customer Form");

        jLabel2.setText("Name");

        jLabel3.setText("Identification");

        jLabel4.setText("Marital status");

        jLabel5.setText("Gender");

        jLabel6.setText("Birth");

        btnClear.setText("Clear all the fields");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit alterations");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        cmbMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - - - - - - - - -", "Single", "Married", "Widowed", "Divorced" }));

        btnGroup.add(rbMale);
        rbMale.setText("Male");

        btnGroup.add(rbFemale);
        rbFemale.setText("Female");

        dcBirth.setDateFormatString("dd-MM-yyyy");

        btnContinue.setText("Continue without editind");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(btnContinue))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rbMale)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbFemale))
                                .addComponent(cmbMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName)
                                .addComponent(txtIdentification)
                                .addComponent(dcBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnSubmit)
                    .addComponent(btnContinue))
                .addGap(32, 32, 32))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        String name = txtName.getText()  ;
        String identification =  txtIdentification.getText() ;
        String maritalStatus = cmbMaritalStatus.getSelectedItem().toString();

        char gender = 'F';

        if ( rbMale.isSelected() ) {
            gender = 'M' ;
        }

        String birth = sdf.format( dcBirth.getDate()  );

        controller.editCustomer( customer , name  , identification , maritalStatus , gender , birth );

        JOptionPane.showMessageDialog( null ,  "Save");

        DisplayPhones displayPhones = new  DisplayPhones (id);
        displayPhones.setVisible(true);
        displayPhones.setLocationRelativeTo(null) ;
        this.dispose();
             
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        txtName.setText("");
        txtIdentification.setText("");
        cmbMaritalStatus.setSelectedIndex(0);
        btnGroup.clearSelection();
        dcBirth.setCalendar(null);

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        
        DisplayPhones displayPhones = new  DisplayPhones (id);
        displayPhones.setVisible(true);
        displayPhones.setLocationRelativeTo(null) ;
        this.dispose();
        
    }//GEN-LAST:event_btnContinueActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnContinue;
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
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtIdentification;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void loadData(int id) {
        
        this.customer = controller.findCustumer(id);
        
        txtName.setText( customer.getName()  );
        txtIdentification.setText( customer.getIdentification() );
      //  txtStreet.setText( customer.getAddress().getStreet()  );
       // txtCity.setText( customer.getAddress().getCity()  );
       // txtDD.setText(  String.valueOf( customer.getPhoneList().get(0).getDd() )  );
       // txtDD2.setText( String.valueOf( customer.getPhoneList().get(1).getDd() )  );
       // txtNumber.setText( String.valueOf( customer.getPhoneList().get(0).getNumber() )  );
        //txtNumber2.setText( String.valueOf( customer.getPhoneList().get(1).getNumber() )  );
        
        if ( customer.getMaritalstatus().equals("Single") ) {
            cmbMaritalStatus.setSelectedIndex(1);
        }else if ( customer.getMaritalstatus().equals("Married") ) {
             cmbMaritalStatus.setSelectedIndex(2);
        }else if ( customer.getMaritalstatus().equals("Widowed") ) {
             cmbMaritalStatus.setSelectedIndex(3);
        }else if ( customer.getMaritalstatus().equals("Divorced") ) {
             cmbMaritalStatus.setSelectedIndex(4);
        }else{
             cmbMaritalStatus.setSelectedIndex(0);      
        }
        
        if ( customer.getGender().equals('F')  ) {
            rbFemale.setSelected(true);
        }else{
            rbMale.setSelected(true);
        }
        
        dcBirth.setDate( customer.getBirth() );
               
    }
 }