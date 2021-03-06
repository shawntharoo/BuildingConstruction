/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Software_Jframes;

import static Software_Jframes.Customer_1.amnt;
import static Software_Jframes.Customer_1.lno;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
public class invoice extends javax.swing.JFrame {

    /**
     * Creates new form invoice
     */
    public invoice() {
        initComponents();
        Random r = new Random();
        setdate();
        
        loadinvoice();
        
        int i= r.nextInt(45897)+789165;
        jLabel12.setText("IN "+i);
        
        
        Customer_1 c = new Customer_1();
        
        jLabel3.setText(c.cno);
        jLabel7.setText(c.pno);
        jLabel8.setText(c.lno);
        jLabel10.setText(amnt);
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        Vector v = new Vector();
        v.add("1");
        v.add(lno);
        v.add(amnt);
        
        dtm.addRow(v);
        
        loadtable(jLabel7.getText());
       
        
    }
    
    public void setdate(){
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String da= sdf.format(d);
        jLabel1.setText(da);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Invoice");
        setAlwaysOnTop(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Level No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 90, -1));

        jLabel4.setText("Customer ID     :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel6.setText("Project No    :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 80, -1));

        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        jLabel9.setText("Total Amount  :  RS.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 100, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Items Name", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 570, 140));

        jLabel11.setText("Invoice No :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 70, -1));

        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 90, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 120, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Project ID", "Level No", "Amount"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 570, 160));

        jLabel13.setText("Invoice No        :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, -1));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 110, -1));

        jButton2.setText("Print Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(670, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String invoice = jLabel12.getText();
        String cid = jLabel3.getText();
        String date= jLabel1.getText();
        String pno = jLabel7.getText();
        String lno=jLabel8.getText();
        String tot_amnt= jTable1.getValueAt(0,2).toString();
        if(tot_amnt.equals("") || tot_amnt.equals(null)){
            this.dispose();
            JOptionPane.showMessageDialog(null,"Please fill the amount field","Error Message",JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        
        System.out.println(tot_amnt);
        int i=0;
        try {
            ResultSet rs= db.statement().executeQuery("select invoice from cust_invoice");
            while(rs.next()){
                if(rs.getString("invoice").equals(invoice)){
                    i=i+1;
                    System.out.println(i);
                }
            }
            
         if(i==1){
             this.dispose();
             JOptionPane.showMessageDialog(null,"Already Created a invoice for this invoice number","Error Message",JOptionPane.ERROR_MESSAGE);
             this.setVisible(true);
             return;
         }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        try {
            db.statement().executeUpdate("insert into cust_invoice(invoice, cid, date, pno, lno, amount)"
                    + " values ('"+invoice+"','"+cid+"','"+date+"','"+pno+"','"+lno+"','"+tot_amnt+"')");
            this.dispose();
            JOptionPane.showMessageDialog(null,"Invoice is saved","Success Message",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String invoice= jComboBox1.getSelectedItem().toString();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        String amnt=null;
        try {
            ResultSet rs= db.statement().executeQuery("select * from cust_invoice where invoice='"+invoice+"'");
            
            while(rs.next()){
              
                jLabel3.setText(rs.getString("cid"));
                jLabel12.setText(invoice);
                jLabel7.setText(rs.getString("pno"));
                jLabel1.setText(rs.getString("date"));
                jLabel8.setText(rs.getString("lno"));
                amnt = rs.getString("amount");
            }
            Vector v = new Vector();
            v.add("1");
            v.add(jLabel8.getText());
            v.add(amnt);
            dtm.addRow(v);
            loadtable(lno);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   String tot_amnt= jTable1.getValueAt(0,2).toString();
        if(tot_amnt.equals("") || tot_amnt.equals(null)){
            this.dispose();
            JOptionPane.showMessageDialog(null,"Please fill the amount field","Error Message",JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }       
        
        
          try {
            Connection c= Software_Jframes.db.statement().getConnection();
        
            //String report = "";
            JasperDesign jd = JRXmlLoader.load("C:\\Users\\Asbar Ali\\Documents\\Building_Constructions\\src\\Ireports\\invoice.jrxml");
            String sql = "SELECT\n" +
"     cust_invoice.`invoice` AS cust_invoice_invoice,\n" +
"     cust_invoice.`cid` AS cust_invoice_cid,\n" +
"     cust_invoice.`date` AS cust_invoice_date,\n" +
"     cust_invoice.`pno` AS cust_invoice_pno,\n" +
"     cust_invoice.`lno` AS cust_invoice_lno,\n" +
"     cust_invoice.`amount` AS cust_invoice_amount\n" +
"FROM\n" +
"     `cust_invoice` cust_invoice where  cust_invoice.`invoice`='IN 791674'";
            JRDesignQuery newquery = new JRDesignQuery();
            newquery.setText(sql);
            jd.setQuery(newquery);
            JasperReport jr=JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,c);
            JasperViewer.viewReport(jp);
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void loadtable(String inv) {
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = db.statement().executeQuery("select * from cust_invoice where pno='"+inv+"'");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("invoice"));
                v.add(rs.getString("pno"));
                v.add(rs.getString("lno"));
                v.add(rs.getString("amount"));
                dtm.addRow(v);
                System.out.println(rs.getString("invoice"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadinvoice() {
        try {
            ResultSet rs= db.statement().executeQuery("select invoice from cust_invoice ");
            while(rs.next()){
                jComboBox1.addItem(rs.getString("invoice"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
