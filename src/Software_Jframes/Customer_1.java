/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Software_Jframes;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asbar Ali
 */
public class Customer_1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Customer_1
     */
    public Customer_1() {
        initComponents();
        load load = new load();
        chart chart = new chart();
      
      
        load.loadpayment_history(jTable1);
        
        load.customer_id(jComboBox3);
       
        jButton12.setEnabled(false);
        String pid= jComboBox4.getSelectedItem().toString();
        
        chart.piechart_customer(jDesktopPane1, pid);
      
    }
   public static String cusno;
   public static String proid;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("Holding Summary"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer No", "Project ID", "Project Status", "project Level", "Amount", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 1230, 230));

        jButton5.setText("Print Invoice");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 120, 30));

        jLabel23.setText("Project ID");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 200, 20));

        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 200, -1));

        jLabel25.setText("Project Level");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel27.setText("Customer No");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 200, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10 - Harbour" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 200, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Basement", "1 st Floor", "2nd floor" }));
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 200, -1));

        jLabel28.setText("Amount");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 20));

        jLabel29.setText("Edit");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jLabel30.setText("Project Status");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jButton6.setText("Add Payment");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 120, 30));

        jLabel22.setText("M.A.M Asbar Ali");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 20));

        jButton12.setText("View Agreement");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 120, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 102));
        jLabel31.setText("Customer Payment (Account Receivable)");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 690, 30));

        jPanel4.setForeground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 102));
        jLabel21.setText("View Customer Payment History");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 680, 30));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setText("Account Receiver from Customer using chart");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 500, 30));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 500, 230));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1324, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static String cno;
public static String pno;
public static String lno;
public static String amnt;

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
           cno=  jComboBox3.getSelectedItem().toString();
           pno=  jComboBox4.getSelectedItem().toString();
           lno=  jComboBox5.getSelectedItem().toString();
           amnt=  jTextField11.getText();
        
        
          
        } catch (Exception e) {
        
        }
        invoice i = new invoice();
        i.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        cusno = jComboBox3.getSelectedItem().toString();
        proid = jComboBox4.getSelectedItem().toString();
        
        Agreement a = new Agreement();
          a.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        load load = new load();
        String amounts= jTextField11.getText();
String number; 

if (!amounts.matches("[0-9]+")) {
     JOptionPane.showMessageDialog(null,"Please enter the  valid amount","Error",JOptionPane.ERROR_MESSAGE);
            return;
}else if(Integer.parseInt(amounts)<10){
        JOptionPane.showMessageDialog(null,"Please enter the  valid amount","Error",JOptionPane.ERROR_MESSAGE);
            return;
    }
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        
        String cust_no = jComboBox3.getSelectedItem().toString();
        String status= jLabel24.getText();
        
        String id = jComboBox4.getSelectedItem().toString();
        String level = jComboBox5.getSelectedItem().toString();
        
        
        if(amounts.equals("") || amounts.equals(null)){
            JOptionPane.showMessageDialog(null,"Please enter the Amount","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(d);
        
        try {
            db.statement().executeUpdate("insert into cus_payment (Cust_no, Project_id, Project_status, Project_level, Amount, Date) values ('"+cust_no+"','"+id+"','"+status+"','"+level+"','"+amounts+"','"+date+"')");
            JOptionPane.showMessageDialog(null,"Successfully Saved","Success Message",JOptionPane.INFORMATION_MESSAGE);
            jButton5.setEnabled(true);
            dtm.setRowCount(0);
            
            load.loadpayment_history(jTable1);
            
            String pid= jComboBox4.getSelectedItem().toString();
            chart chart = new chart();
            chart.piechart_customer(jDesktopPane1, pid);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
      
       String a= jComboBox3.getSelectedItem().toString();
       jComboBox4.removeAllItems();
        try {
            ResultSet rs= db.statement().executeQuery("select id  from con_sites where Cust_id='"+a+"'");
            while(rs.next()){
                jComboBox4.addItem(rs.getString("id"));
               
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        jButton12.setEnabled(true);                  
        jComboBox5.removeAllItems();
        
        try {
            int count = 0;
            String a= jComboBox4.getSelectedItem().toString();
    
            ResultSet rs= db.statement().executeQuery("select status,no_levels  from Con_sites where id='"+a+"'");
            while(rs.next()){
               jLabel24.setText(rs.getString("status"));
               count = rs.getInt("no_levels");
                System.out.println(count);
            }
           for(int j=0;j<count;j++){
               jComboBox5.addItem("Level "+j);
           }
            
        } catch (Exception e) {
         
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
     
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pid= jComboBox4.getSelectedItem().toString();
        chart chart = new chart();
        chart.piechart_customer(jDesktopPane1, pid);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField11;
    // End of variables declaration//GEN-END:variables

   

   

}
