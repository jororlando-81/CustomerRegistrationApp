package com.mycompany.customerregistration.igu;

import com.mycompany.customerregistration.logic.Address;
import com.mycompany.customerregistration.logic.ControllerLogic;
import com.mycompany.customerregistration.logic.Customer;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class DisplayAddress extends javax.swing.JFrame {

    ControllerLogic controller = null ;
     
    int id ;
    
    public DisplayAddress( int id) {
       
        initComponents();
        
        this.id = id ;
        
        controller = new ControllerLogic();
        
        loadTable(id);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        TXT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();

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

        btnEdit.setText("Edit ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Select row to edit");

        btnContinue.setText("Continue without editing");
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
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnContinue)
                            .addComponent(TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnEdit)
                        .addGap(42, 42, 42)
                        .addComponent(btnContinue)
                        .addGap(36, 36, 36)
                        .addComponent(TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
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
        
         loadTable( id);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        if ( table.getRowCount() > 0  )  {
           
            if ( table.getSelectedRow() != -1 ) { 
            
                int idAddress = Integer.parseInt( String.valueOf(table.getValueAt(table.getSelectedRow() ,0 )  ) ) ;
                
                AddressEdit addressEdit = new  AddressEdit ( id , idAddress );
                addressEdit.setVisible(true);
                addressEdit.setLocationRelativeTo(null) ;  
                
                this.dispose();
            }
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        
        Display display = new  Display ();
        display.setVisible(true);
        display.setLocationRelativeTo(null) ;
        this.dispose();
        
    }//GEN-LAST:event_btnContinueActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXT;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void loadTable(int id) {
       
        DefaultTableModel tableModel = new DefaultTableModel () {
            
            
            public boolean iscellEditable ( int row, int column  ) {
                return false ;
                
            }
            
        };
        
        String title [] = { "Id", "Street" , "City"} ;
        
        tableModel.setColumnIdentifiers(title);
        
        List <Address> listAddress = controller.showAddress();
        
        Customer customer = controller.findCustumer(id) ;
          
        TXT.setText( String.valueOf(id)  );
        
        if ( listAddress != null)  { 
            
            for ( Address address : listAddress  ) { 
                
                if ( customer.getId().equals(  address.getCustomerId().getId()  ) )  { 
                
                    Object[] object = { 
                    address.getId(),
                    address.getStreet(),
                    address.getCity(), 
                    
                    } ;
                    
                    tableModel.addRow(object);
                 }                
            }
        }
        
        table.setModel(tableModel); 
    }
}
