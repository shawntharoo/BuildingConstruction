/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_new;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dilan Madura
 */
public class New_invoice extends javax.swing.JInternalFrame {

    /**
     * Creates new form New_invoice
     */



    public New_invoice() {
        initComponents();
        loadpo();
        Random r = new Random();
        int a=r.nextInt(30000)+1100000;
        jLabel19.setText("INV0"+a);
        date();
    }
public void date(){

Date d=new Date();
    SimpleDateFormat da=new SimpleDateFormat("yyyy-MM-dd");
    String dd=da.format(d);
    jLabel23.setText(dd);


}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Item Name", "Quty", "Price", "Damage", "Discount (%)", "Amount (Rs)"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 610, 310));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 100, 20));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 80, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chack", "Casch" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 90, 90, -1));

        jLabel18.setText("MRN No");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, -1, -1));

        jLabel17.setText("PO No");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, 20));

        jLabel14.setText("Supplier");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        jLabel12.setText("Supplier's Invoice");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 100, -1));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 90, 20));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 90, 20));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 60, 80, 20));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 144, 90, 30));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Invoice");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 650, 30));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item No", "Item Name", "Quty"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 540, 180));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("view Purchase Orders");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 630, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PO No", "MNR No", "Supplier", "Current Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 560, 130));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 100, -1));

        jLabel8.setText("Order Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("View Purchase Order Details");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 630, 30));

        jLabel13.setText("Date");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 60, -1, -1));

        jLabel15.setText("Payment Type");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, -1, -1));

        jLabel16.setText("Total Amount");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 150, -1, -1));

        jLabel11.setText("Invoice ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 70, 20));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 290, 70, 20));

        jLabel9.setText("Requer Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 320, 70, 20));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 120, -1));

        jLabel2.setText("Enter The PO No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 110, -1));

        jLabel5.setText("PO No");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel7.setText("Supplier");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 60, 20));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 90, 20));

        jLabel6.setText("MRN or GRN NO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jButton2.setText("Create Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 210, -1));

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String poid =jTextField2.getText();
        
        if(poid.isEmpty()){JOptionPane.showMessageDialog(null,"Enter PO ID","Error Message",JOptionPane.ERROR_MESSAGE);}
        
          else{
     
     try {
            ResultSet rs= db.getconnection().createStatement().executeQuery("select * from sup_po where po='"+poid+"'");
            
            while(rs.next()){
                jLabel25.setText(rs.getString("pro_id"));
                //jLabel27.setText(rs.getString("supp_id"));
                jLabel26.setText(rs.getString("MRN_NO"));
                jLabel28.setText(rs.getString("curr_date"));
                jLabel28.setText(rs.getString("require_date"));
                //po, pro_id, sub_con, item_type, loc, curr_date, req_date, MRN_NO
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        loadta();
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

       
        
        String invoice= jLabel19.getText();
        String su_in=jTextField3.getText();
        String supplier=jLabel20.getText();
        String po_id=jLabel21.getText();
        String mrn_id=jLabel22.getText();
        String date=jLabel23.getText();
    
        String pay=jComboBox1.getSelectedItem().toString();
        String amount=jLabel24.getText();
        if(su_in.isEmpty()){JOptionPane.showMessageDialog(null,"Enter the Suppliers Invoice Number","Error Message",JOptionPane.ERROR_MESSAGE);}
        else if(pay.isEmpty()){JOptionPane.showMessageDialog(null,"Selact Payment type","Error Message",JOptionPane.ERROR_MESSAGE);}
                // TODO add your handling code here:
            try {
           
            
            
            db.getconnection().createStatement().executeUpdate("insert into supplier_invoice(idsupplier_invoice, supplier_in,supplier,po,mrn,date,pay_type,amount)"
                + " values ('"+invoice+"','"+su_in+"','"+supplier+"','"+po_id+"','"+mrn_id+"','"+date+"','"+pay+"','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Successfully Saved","Success Message",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         loadtable2();
        
        String po=jLabel25.getText();
         String sup=jLabel27.getText();
          String mrn=jLabel26.getText();
          
        jLabel21.setText(po);
        jLabel20.setText(sup);
        jLabel22.setText(mrn);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void loadpo() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs= db.getconnection().createStatement().executeQuery("select * from sup_po ");
           while(rs.next()){
                Vector v = new Vector();
            v.add(rs.getString("po"));
            v.add("");
            v.add("");
            v.add(rs.getString("curr_date"));
            dtm.addRow(v);
           }
            
        } catch (Exception e) {
            e.printStackTrace();
                    
        }
    }
    
    private void loadta() {
        
        String x=jLabel26.getText();
        DefaultTableModel dtm = (DefaultTableModel) jTable3.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs= db.getconnection().createStatement().executeQuery("select * from material_request_note where MRN_NO='"+x+"' ");
           while(rs.next()){
            Vector v = new Vector();
            v.add(rs.getString("Mat_no"));
            v.add(rs.getString("Mat_name"));
            v.add(rs.getString("Unit_amount"));
            
            dtm.addRow(v);
           }
            
        } catch (Exception e) {
            e.printStackTrace();
                    
        }
    }
       public void loadtable2() {
           
           String mrn=jLabel22.getText();
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        try {
            ResultSet rs= db.getconnection().createStatement().executeQuery("select * from material_request_note where MRN_NO='"+mrn+"'");
           while(rs.next()){
               Vector v = new Vector();
               
               
               v.add(rs.getString("Mat_no"));
               v.add(rs.getString("Mat_name"));
               v.add(rs.getString("Unit_amount"));
               dtm.addRow(v);
           } 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    
