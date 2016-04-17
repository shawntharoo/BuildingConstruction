/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Software_Jframes;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asbar Ali
 */
public class Sub_contractor extends javax.swing.JFrame {

    /**
     * Creates new form Sub_contractor
     */
    public Sub_contractor() {
        initComponents();
        date();
        loadtable();
        loadproid();
        
        loadsub_payment_id();
        
        jRadioButton1.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sub Contractor Payment");
        setAlwaysOnTop(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Payment Type");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Without Meterial");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("With Meterial");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        jLabel2.setText("Project ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 120, 20));

        jLabel4.setText("Amount");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 120, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 200, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Daily", "Monthly", "Levels" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 200, -1));

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 210, 360));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 200, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Project ID", "Sub ID", "Date", "Amount"
            }
        ));
        jTable1.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 520, 200));

        jLabel6.setText("Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel7.setText("Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Sub Contractor Payment");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, -1));

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 120, 30));

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 120, 30));

        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(909, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String met = null;
        String subid= jLabel3.getText();
        String date =jLabel5.getText();
        String amount=jTextField1.getText();
        String type= jComboBox1.getSelectedItem().toString();
        String pid = jComboBox2.getSelectedItem().toString();
        
        if(subid.equals("") || subid.equals(null)){
            this.dispose();
            JOptionPane.showMessageDialog(null,"Please Select the subcontract id","Error Message",JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        
        if(amount.equals("") || amount.equals(null)){
            this.dispose();
            JOptionPane.showMessageDialog(null,"Please enter the amount","Error Message",JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        if (!amount.matches("[0-9]+")) {
            this.dispose();
            JOptionPane.showMessageDialog(null,"Please enter the Number","Error Message",JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            jTextField1.setText("");
            return;
                }
        
        if(jRadioButton1.isSelected()){
            met="Without Meterial";
        }else{
            met="With Meterial";
        }
        
        try {
            db.statement().executeUpdate("insert into sub_payment (meterial, date, amount, type, project_id,sub_id) "
                    + "values ('"+met+"','"+date+"','"+amount+"','"+type+"','"+pid+"','"+subid+"') ");
            this.dispose();
            JOptionPane.showMessageDialog(null,"Successfully Added","Success Message",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(true);
            jTextField1.setText("");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       loadsubid();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
       ListModel l = jList1.getModel();
       int row=jList1.getSelectedIndex();
       String name= l.getElementAt(row).toString();
       jLabel3.setText(name);
       
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String id= jComboBox3.getSelectedItem().toString();
        try {
           db.statement().executeUpdate("delete from sub_payment where id='"+id+"'");
             loadproid();
            this.dispose();
            JOptionPane.showMessageDialog(null,"Successfully Deleted","Error Message",JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sub_contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sub_contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sub_contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sub_contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sub_contractor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void date() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        jLabel5.setText(sdf.format(d));
    }

    private void loadproid() {
        try {
            jComboBox2.removeAllItems();
            ResultSet rs= db.statement().executeQuery("select id from con_sites");
            while(rs.next()){
                jComboBox2.addItem(rs.getString("id"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   

    private void loadsubid() {
         try {
          
              String pid= jComboBox2.getSelectedItem().toString();
              System.out.println(pid);
            ResultSet rs= db.statement().executeQuery("select * from task_allocate where pro_id="+pid+" ");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("sub_id"));
                jList1.setListData(v);
            }
            
        } catch (Exception e) {
           
        }
    }

    private void loadsub_payment_id() {
        try {
            ResultSet rs= db.statement().executeQuery("select id from sub_payment");
            while(rs.next()){
                jComboBox3.addItem(rs.getString("id"));
            }
            
        } catch (Exception e) {
        }
    }

    private void loadtable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        try {
            ResultSet rs= db.statement().executeQuery("select * from sub_payment");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("project_id"));
                v.add(rs.getString("sub_id"));
                v.add(rs.getString("date"));
                v.add(rs.getString("amount"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
        }
    }
}
