/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Software_Jframes;

import java.awt.Image;
import java.awt.Label;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asbar Ali
 */
public class Employee_1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Employee_1
     */
    public Employee_1() {
        initComponents();
       
        loadEmp();
        
        jLabel31.setText("");
        jLabel33.setText("");
        jLabel48.setText("");
    }
  public ImageIcon ResizeImage(String ImagePath,JLabel jlabel) { 
        ImageIcon MyImage = new ImageIcon(ImagePath); 
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(jlabel.getWidth(), jLabel16.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg); 
        return image;
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel54 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();

        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1324, 621));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Employee Id");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jTextField7.setPreferredSize(new java.awt.Dimension(15, 20));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 200, -1));

        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 120, 30));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Id", "Name", "Occupation", "Salary", "Month"
            }
        ));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 580, 190));

        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 160, 120));

        jLabel20.setText("Salary            :");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 80, -1));

        jLabel26.setText("Occupation    :");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel31.setText("jLabel31");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, -1));

        jLabel32.setText("Email              :");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel33.setText("jLabel33");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, -1));

        jLabel48.setText("jLabel48");
        jPanel5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 150, -1));

        jLabel53.setText("Sort By");
        jPanel5.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Employee Id", "Name", "Job States" }));
        jPanel5.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 200, -1));

        jLabel54.setText("Group By");
        jPanel5.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, 20));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Supervisor", "Engineer", "Internal Staff" }));
        jPanel5.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 190, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Search Employee ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 580, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Employee Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 580, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Overview of Employees Account History");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 580, 30));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Monthly Salary of Employee");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 650, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "January", "February", "March", "April", "May", "June", "july", "August", "September", "October", "November", "December"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 650, 430));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020" }));
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
       String sid= jTextField7.getText();
       
       
       
       if(sid.equals("") || sid.equals(null)){
           JOptionPane.showMessageDialog(null,"Please Enter the search id","Error in Search",JOptionPane.ERROR_MESSAGE);
           return;
       }
       
     
       int i=0;
        try {
            ResultSet rs= db.statement().executeQuery("Select idemployee from employee  ");
            while(rs.next()){
                if(sid.equals(rs.getString("idemployee"))){
                  
                   i=i+1;
                }  
            }
             if(i==0){
                   JOptionPane.showMessageDialog(null,"Please enter the valid employee id","Error in Search",JOptionPane.ERROR_MESSAGE);
                   return;
                } 
            
        } catch (Exception e) {
        }
        loadmothlySalary(sid);
        load_employee();
       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
       int row =jTable6.getSelectedRow();
       int col =jTable6.getSelectedColumn();
        String table_value= jTable6.getValueAt(row, 0).toString();
        jTextField7.setText(table_value);
     
                
    }//GEN-LAST:event_jTable6MouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    public void load_employee() {
         String ids= jTextField7.getText();
       
      int id_emp= Integer.parseInt(ids);
        
        try {
        String  Emp_id=jTextField7.getText();
      
            ResultSet rs= db.statement().executeQuery("select * from employee,emp_payment  where idemployee=empid and idemployee like '"+id_emp+"'");
         
            ImageIcon newimage = new ImageIcon();
            while(rs.next()){
                jLabel31.setText(rs.getString("occupation"));
                jLabel33.setText(rs.getString("email"));
                //jLabel48.setText("Rs."+rs.getString("msalary")+"/=");
                String empimg = rs.getString("empimage");
                  System.out.println(empimg);
             JLabel jlabel = jLabel16;
             jLabel16.setIcon(ResizeImage(empimg,jlabel));
             
            }   
            
            
      
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadEmp() {
        
        
        try {
          ResultSet rs = db.statement().executeQuery("select empid,idemployee,fname,occupation,msalary,ep.date from employee e,emp_payment ep where empid=idemployee");
          
          DefaultTableModel dtm = (DefaultTableModel) jTable6.getModel();
       while(rs.next()){
            String date = rs.getString("date");
            String arr[]=   date.split("-");
            
            int id= rs.getInt("idemployee");
            String fname = rs.getString("fname");
               
            String occ = rs.getString("occupation");
               
            float Sal1 = rs.getFloat("msalary");
            
          
            Vector v = new Vector();
          
            v.add(id);
            v.add(fname);
            v.add(occ);
            v.add(Sal1);
            v.add(arr[1]);
            
             dtm.addRow(v);
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadmothlySalary(String sid) {
       DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
       String getyear= jComboBox1.getSelectedItem().toString();
       
       dtm.setColumnCount(0);
       dtm.setRowCount(0);
       Vector v = new Vector();
        try {
            int m=0;
            String date=null;
            String year=null;
            ResultSet rs= db.statement().executeQuery("select msalary,date from emp_payment where empid='"+sid+"'");
            while(rs.next()){
                m= rs.getInt("msalary");
                date= rs.getString("date");
            
            System.out.println(m);
            String arr[]= date.split("-");
            date= arr[1];
            year=arr[0];
            if(date.equals("01") && getyear.equals(year)){
                dtm.addColumn("Janauary");
                v.add(m);
                
                }
            if(date.equals("02") && getyear.equals(year)){
                dtm.addColumn("February");
                v.add(m);
                
                }
            if(date.equals("03") && getyear.equals(year)){
                dtm.addColumn("March");
                v.add(m);
                
                }
            if(date.equals("04") && getyear.equals(year)){
                dtm.addColumn("April");
                v.add(m);
                
                }
            if(date.equals("05") && getyear.equals(year)){
                dtm.addColumn("May");
                v.add(m);
                
                }
            if(date.equals("06") && getyear.equals(year)){
                dtm.addColumn("June");
                v.add(m);
                
                }
            if(date.equals("07") && getyear.equals(year)){
                dtm.addColumn("July");
                v.add(m);
                
                }
            if(date.equals("08") && getyear.equals(year)){
                dtm.addColumn("May");
                v.add(m);
                
                }
            if(date.equals("09") && getyear.equals(year)){
                dtm.addColumn("September");
                v.add(m);
                
                }
            if(date.equals("10") && getyear.equals(year)){
                dtm.addColumn("October");
                v.add(m);
                
                }
            if(date.equals("11") && getyear.equals(year)){
                dtm.addColumn("November");
                v.add(m);
                
                }
            if(date.equals("12") && getyear.equals(year)){
                dtm.addColumn("December");
                v.add(m);
                
                }
            }
            dtm.addRow(v);
            
        } 
            
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
