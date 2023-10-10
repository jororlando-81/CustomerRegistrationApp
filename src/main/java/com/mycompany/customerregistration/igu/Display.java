package com.mycompany.customerregistration.igu;

import com.mycompany.customerregistration.logic.ControllerLogic;
import com.mycompany.customerregistration.logic.Customer;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Display extends javax.swing.JFrame {

    ControllerLogic controller = null ;
     
    SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy"); 
    
    public Display() {
       
        initComponents();
        
        controller = new ControllerLogic();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table);

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Select row to edit");

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRemove)
                        .addGap(34, 34, 34)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnMenu))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnRemove)
                    .addComponent(btnMenu))
                .addGap(64, 64, 64))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
         loadTable();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        if ( table.getRowCount() > 0  )  {
           
            if ( table.getSelectedRow() != -1 ) { 
            
                int id = Integer.parseInt( String.valueOf(table.getValueAt(table.getSelectedRow() ,0 )  ) ) ;
                
                controller.removeCustomer( id );    
                
                loadTable();
            }
        }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        if ( table.getRowCount() > 0  )  {
           
            if ( table.getSelectedRow() != -1 ) { 
            
                int id = Integer.parseInt( String.valueOf(table.getValueAt(table.getSelectedRow() ,0 )  ) ) ;
                
                CustomerEdit customerEdit = new  CustomerEdit ( id );
                customerEdit.setVisible(true);
                customerEdit.setLocationRelativeTo(null) ;  
                
                this.dispose();
            }
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btnMenuActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
       
        DefaultTableModel tableModel = new DefaultTableModel () {
            
            
            public boolean iscellEditable ( int row, int column  ) {
                return false ;
                
            }
            
        };
        
        String title [] = { "Id", "Name", "Birth" , "Gender" , "Identification", "Marital status",  "City" , "Street", "DD", "Phone1"  , "DD", "Phone2" } ;
        
        tableModel.setColumnIdentifiers(title);
        
        
        
        List <Customer> listCustomer = controller.showCustomer();
        
        if ( listCustomer != null  ) { 
            
            for ( Customer customer : listCustomer  ) { 
                
                Object[] object = { 
                customer.getId() 
                , customer.getName()
                , sdf.format( customer.getBirth() )
                , customer.getGender()
                , customer.getIdentification()
                , customer.getMaritalstatus()
                , customer.getAddress().getCity()
                , customer.getAddress().getStreet()
                , customer.getPhoneList().get(0).getDd()
                , customer.getPhoneList().get(0).getNumber() 
                , customer.getPhoneList().get(1).getDd()
                , customer.getPhoneList().get(1).getNumber() 
                } ;
                
                tableModel.addRow(object);
                
                
            }
        }
        
        table.setModel(tableModel); 
    }
}
