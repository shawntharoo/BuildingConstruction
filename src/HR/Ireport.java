/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Asbar Ali
 */
public class Ireport extends javax.swing.JFrame {

    /**
     * Creates new form Ireport
     */
    public Ireport() {
        initComponents();
        loadcombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jButton1)))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id= jComboBox1.getSelectedItem().toString();
        if(id.equals("All")){
        try {
            Connection c= Software_Jframes.db.statement().getConnection();
        
            //String report = "";
            JasperDesign jd = JRXmlLoader.load("C:\\Users\\Asbar Ali\\Documents\\Building_Constructions\\src\\Ireports\\HR.jrxml");
            String sql = "SELECT\n" +
"     employee.`idemployee` AS employee_idemployee,\n" +
"     employee.`fname` AS employee_fname,\n" +
"     employee.`occupation` AS employee_occupation,\n" +
"     employee.`specialization` AS employee_specialization,\n" +
"     emp_payment.`idemp_payment` AS emp_payment_idemp_payment,\n" +
"     emp_payment.`tsalary` AS emp_payment_tsalary,\n" +
"     emp_payment.`otamount` AS emp_payment_otamount,\n" +
"     emp_payment.`hdamount` AS emp_payment_hdamount,\n" +
"     emp_payment.`date` AS emp_payment_date,\n" +
"     emp_payment.`paid` AS emp_payment_paid,\n" +
"     leave_request.`reason` AS leave_request_reason,\n" +
"     leave_request.`date` AS leave_request_date,\n" +
"     employee.`gender` AS employee_gender,\n" +
"     employee.`email` AS employee_email,\n" +
"     emp_payment.`msalary` AS emp_payment_msalary,\n" +
"     emp_payment.`allowance` AS emp_payment_allowance\n" +
"FROM\n" +
"     `employee` employee INNER JOIN `emp_payment` emp_payment ON employee.`idemployee` = emp_payment.`empid`\n" +
"     INNER JOIN `leave_request` leave_request ON employee.`idemployee` = leave_request.`idemployee`";
            JRDesignQuery newquery = new JRDesignQuery();
            newquery.setText(sql);
            jd.setQuery(newquery);
            JasperReport jr=JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,c);
            JasperViewer.viewReport(jp);
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
        }else {
        try {
            Connection c= Software_Jframes.db.statement().getConnection();
        
            //String report = "";
            JasperDesign jd = JRXmlLoader.load("C:\\Users\\Asbar Ali\\Documents\\Building_Constructions\\src\\Ireports\\HR.jrxml");
            String sql = "SELECT\n" +
"     employee.`idemployee` AS employee_idemployee,\n" +
"     employee.`fname` AS employee_fname,\n" +
"     employee.`occupation` AS employee_occupation,\n" +
"     employee.`specialization` AS employee_specialization,\n" +
"     emp_payment.`idemp_payment` AS emp_payment_idemp_payment,\n" +
"     emp_payment.`tsalary` AS emp_payment_tsalary,\n" +
"     emp_payment.`otamount` AS emp_payment_otamount,\n" +
"     emp_payment.`hdamount` AS emp_payment_hdamount,\n" +
"     emp_payment.`date` AS emp_payment_date,\n" +
"     emp_payment.`paid` AS emp_payment_paid,\n" +
"     leave_request.`reason` AS leave_request_reason,\n" +
"     leave_request.`date` AS leave_request_date,\n" +
"     employee.`gender` AS employee_gender,\n" +
"     employee.`email` AS employee_email,\n" +
"     emp_payment.`msalary` AS emp_payment_msalary,\n" +
"     emp_payment.`allowance` AS emp_payment_allowance\n" +
"FROM\n" +
"     `employee` employee INNER JOIN `emp_payment` emp_payment ON employee.`idemployee` = emp_payment.`empid`\n" +
"     INNER JOIN `leave_request` leave_request ON employee.`idemployee` = leave_request.`idemployee` where employee.`idemployee`='"+id+"'";
            JRDesignQuery newquery = new JRDesignQuery();
            newquery.setText(sql);
            jd.setQuery(newquery);
            JasperReport jr=JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,c);
            JasperViewer.viewReport(jp);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Ireport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ireport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ireport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ireport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ireport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    // End of variables declaration//GEN-END:variables

    private void loadcombo() {
 
                ResultSet rs;
        try {
            rs = db.connect().createStatement().executeQuery("select idemployee from employee");
             while(rs.next()){
                 jComboBox1.addItem(rs.getString("idemployee"));
             }
        } catch (SQLException ex) {
           
        }
               
 }
}