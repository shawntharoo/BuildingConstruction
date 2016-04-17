/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HR;

import test_new.*;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asbar Ali
 */
public class Leave extends javax.swing.JFrame {

    /**
     * Creates new form Leave
     */
    public Leave() {
        initComponents();
        initial_load();
        
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
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee_ID", "Date", "Reason", "leave type", "medical", "payment type"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1100, 430));

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 51, 51));
        jLabel49.setText("Leave History Details");
        jPanel12.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 580, 30));

        jLabel1.setText("Employee ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 80, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 120, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, -1, -1));

        jLabel2.setText("To Delete Select The Correspondent Row From The Table");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 430, -1));

        setSize(new java.awt.Dimension(1170, 583));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
         noemployee_l();
         initial_load();
        loadleave();
        
        
       
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        noemployee_l();
        initial_load();
        loadleave();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row= jTable6.getSelectedRow();
        
       String  delete= jTable6.getValueAt(row, 0).toString();
       
       try {
            db.connect().createStatement().executeUpdate("delete from leave_request where idemployee='"+delete+"'");
             this.dispose();
            JOptionPane.showMessageDialog(null,"Successfully deleted","Deleted Message",JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
             initial_load();

        } catch (Exception e) {
            e.printStackTrace();
        }
       
        System.out.println(delete);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Leave().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void loadleave() {
       String id= jTextField1.getText();
        DefaultTableModel dtm = (DefaultTableModel) jTable6.getModel();
        dtm.setRowCount(0);
            
            try {
                ResultSet rs=   db.connect().createStatement().executeQuery("select * from leave_request where idemployee='"+id+"'");
     
                 while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("idemployee"));
                v.add(rs.getString("date"));
                v.add(rs.getString("reason"));
                v.add(rs.getString("l_type"));
                v.add(rs.getString("Medical"));
                v.add(rs.getString("payment_type"));

              dtm.addRow(v);
                }
            
            } catch (Exception e) {
        }
    }

    private void initial_load() {
 DefaultTableModel dtm = (DefaultTableModel) jTable6.getModel();
 dtm.setRowCount(0);
            
            try {
                ResultSet rs=   db.connect().createStatement().executeQuery("select * from leave_request");
     
                 while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("idemployee"));
                v.add(rs.getString("date"));
                v.add(rs.getString("reason"));
                v.add(rs.getString("l_type"));
                v.add(rs.getString("Medical"));
                v.add(rs.getString("payment_type"));

              dtm.addRow(v);
                }
            
            } catch (Exception e) {
        }
    }

    private void noemployee_l() {
        String id2 = jTextField1.getText();
         int i=0;
        try {
            
            ResultSet rs= db.connect().createStatement().executeQuery("select idemployee from employee");
            while (rs.next()){
            String idem =  rs.getString("idemployee");
            if( idem.equals(id2)){
                i=i+1;
            } else {
            }
            }
            
          
            }
        catch (Exception e) {
        }
          if(i==0){
              this.dispose();
             JOptionPane.showMessageDialog(null,"There is no employee with this ID");
             
             this.setVisible(true);
             jTextField1.setText("");
             
             
            // return;
            }else{
                
            }
    }
}
