/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import test_new.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;






public final class Registered extends javax.swing.JInternalFrame {
   
    private String Cust_id;
  
   
    public Registered() {
         initComponents();
         tableload(Cust_id);
        
            
        Random ran = new Random();
        int n=ran.nextInt(5000)+7;
        jLabel3.setText(n+"");
    }
    

   
 public ImageIcon ResizeImage(String ImagePath) { 
        ImageIcon MyImage = new ImageIcon(ImagePath); Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg); 
        return image;
 }
 
 
 
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 153));
        jLabel21.setText("Customer Registration");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(564, 564, 564)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1330, -1));

        jLabel15.setText("Full Name");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jTextField2.setPreferredSize(new java.awt.Dimension(16, 120));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 200, 20));

        jLabel16.setText("Customer NIC:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jTextField3.setPreferredSize(new java.awt.Dimension(16, 120));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setPreferredSize(new java.awt.Dimension(16, 120));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 200, 86));

        jLabel22.setText("Date:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        jLabel18.setText("Address:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        jLabel17.setText("Tell No:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        jLabel23.setText("Email:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        jTextField5.setPreferredSize(new java.awt.Dimension(16, 120));
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 200, 20));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 153));
        jLabel24.setText("View Customer Registration Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addContainerGap())
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1340, -1));

        jLabel19.setText("Customer ID:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jToggleButton1.setText("Search");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 120, 30));

        jTextField6.setPreferredSize(new java.awt.Dimension(16, 120));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        jPanel4.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 200, 20));

        jTextField7.setPreferredSize(new java.awt.Dimension(16, 120));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });
        jPanel4.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 200, 20));

        jButton4.setText("Browse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 210, 120, 30));

        jLabel14.setText("Customer ID :");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel25.setText("Customer Type");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single Customer", "Company" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(16, 120));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, 20));
        jComboBox1.getAccessibleContext().setAccessibleName("");

        jLabel26.setText("Company Type");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Goverment", "Private" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(16, 120));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 200, 20));

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 120, 30));

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 120, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Type", "Company Type", "Full Name or Compny Name", "Customer ID", "NIC", "Date", "Tell No", "Email", "Address", "Image"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 1220, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pobrane.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 70, 120, 120));

        jButton1.setText("Print PDF report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 280, 120, 30));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 200, -1));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, 20));

        jButton3.setText("View Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1313, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
     
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

            
                
                 

    
         String cus_type=(String) jComboBox1.getSelectedItem();
         String Com_type=(String) jComboBox2.getSelectedItem();
         String F_nam=jTextField2.getText();
         String Cus_ID=jLabel3.getText();
         String Cus_NIC=jTextField3.getText();
         
         Date date1=jDateChooser1.getDate();
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
         String date= sdf.format(date1);
         
         String tell=jTextField7.getText();
         String email=jTextField5.getText();
         String Addr=jTextArea1.getText();
         String img=jLabel4.getText();
         
               String eml="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";              
                
                 if (F_nam.isEmpty()) {
                     JOptionPane.showMessageDialog(null,"Enter the Customer Name","Error in Full name", JOptionPane.ERROR_MESSAGE);
                 }
                else if((Cus_NIC.length()!=10)){
                     JOptionPane.showMessageDialog(this, "Invalid Mobile number (NIC number must be 9 digit and V )");
                }
               
                
                else if((tell.length()!=10)){
                     JOptionPane.showMessageDialog(this, "Invalid Mobile number (Mobile number must be 10 digit)");
                }
                else if (Addr.isEmpty()) {
                     JOptionPane.showMessageDialog(null,"Enter the Address");
                
                }
                    
               else if (!email.matches(eml))
                   JOptionPane.showMessageDialog(null,"Invalid Email(Email must be contained '@' & '.' symbols)");
        
              
                else{
                   
                   img = img.replace("\\","/");
        try {
            Statement st= db.getconnection().createStatement();
            st.executeUpdate("Insert into customer(  Cust_type, Company_type,Name, Cust_id,  Cus_nic_Comp_no, Date,Telephone, Email, Address, image) values('"+ cus_type +"','"+ Com_type +"','"+F_nam  +"','"+ Cus_ID +"','"+ Cus_NIC +"','"+date+"','"+ tell +"','"+ email +"','"+Addr+"','"+img+"')");
            JOptionPane.showMessageDialog(null,"Successfully Saved,,,");
            
                       jTextField2.setText(null);
                       jTextField3.setText(null);
                       jDateChooser1.setDate(null);
                       jTextField7.setText(null);
                       jTextField5.setText(null);
                       jTextArea1.setText(null);
                       jLabel4.setText(null);
                          
                      
                       
                       Random ran = new Random();
                       int n=ran.nextInt(5000)+7;
                       jLabel3.setText(n+"");
            
 
 
        } catch (Exception e) {
            e.printStackTrace();
        }
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            tableload(Cust_id);
    }
    }
    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         
        
        
        JFileChooser file = new JFileChooser();
           FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
           file.setFileFilter(filter);
           int result = file.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            jLabel4.setText(path);
            jLabel4.setIcon(ResizeImage(path));
        }
 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String type = jComboBox1.getSelectedItem().toString();
        if (type.equals("Company")) {
            jLabel15.setText("Company Name");
            jLabel16.setText("Company Reg.No");
            jComboBox2.setVisible(true);
            jLabel26.setVisible(true);

        } else {
           
            jLabel15.setText("First Name");
            jLabel16.setText("NIC No");
           

            jComboBox2.setVisible(false);
            jLabel26.setVisible(false);

        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
 
        
        
                      
         String cus_type=(String) jComboBox1.getSelectedItem();
         String Com_type=(String) jComboBox2.getSelectedItem();
         String F_nam=jTextField2.getText();
         String Cus_ID=jLabel3.getText();
         String Cus_NIC=jTextField3.getText();
         Date date=jDateChooser1.getDate();
         String tell=jTextField7.getText();
         String email=jTextField5.getText();
         String Addr=jTextArea1.getText();
         String img=jLabel4.getText();  
        
         
         
         if(Cus_ID.equals("")|| Cus_ID == null){
            JOptionPane.showMessageDialog(null,"Please Search and enter the Customer ID","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        
        tableload(Cust_id); 
       
         String eml="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";              
                
                 if (F_nam.isEmpty()) {
                     JOptionPane.showMessageDialog(null,"Enter the Customer Name","Error in Full name", JOptionPane.ERROR_MESSAGE);
                 }
                else if((Cus_NIC.length()!=10)){
                     JOptionPane.showMessageDialog(this, "Invalid Mobile number (NIC number must be 9 digit and V )");
                }
               
                
                else if((tell.length()!=10)){
                     JOptionPane.showMessageDialog(this, "Invalid Mobile number (Mobile number must be 10 digit)");
                }
                else if (Addr.isEmpty()) {
                     JOptionPane.showMessageDialog(null,"Enter the Address");
                
                }
                    
               else if (!email.matches(eml))
                   JOptionPane.showMessageDialog(null,"Invalid Email(Email must be contained '@' & '.' symbols)");
        
              
                else{
   
         try {
             Statement st= db.getconnection().createStatement();
            st.executeUpdate("update customer set Cust_id='"+Cus_ID+"', Cust_type ='"+ cus_type +"',Name='"+ F_nam +"',Company_type='"+ Com_type +"',Cus_nic_Comp_no='"+ Cus_NIC +"',Date='"+date+"',Telephone='"+ tell +"',Email='"+ email +"',Address='"+Addr+"',image='"+img+"' where Cust_id='"+ Cus_ID +"'");
              JOptionPane.showMessageDialog(null,"Successfully Update,,,"); 
             
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
           DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        
         tableload(Cust_id); 

               }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  String Registered = jLabel3.getText();
  
        if(Registered.equals("")|| Registered == null){
            JOptionPane.showMessageDialog(null, "Please enter the Registration","Error in Registration", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int x=JOptionPane.showConfirmDialog(null, "Do you want to delete this");
       
       if(x==0){
       
           try {
               com.mysql.jdbc.Statement st= (com.mysql.jdbc.Statement) db.getconnection().createStatement();
               st.executeUpdate("DELETE from customer where cust_id='"+Registered+"'");
               tableload(Cust_id);
               jTextField2.setText(null);
            
                     
                       jTextField3.setText(null);
                       jDateChooser1.setDate(null);
                       jTextField7.setText(null);
                       jTextField5.setText(null);
                       jTextArea1.setText(null);
                       jLabel4.setText(null);
           } catch (Exception e) {
               e.printStackTrace();
           }
       }  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
int r = jTable2.getSelectedRow();
          jComboBox1.setSelectedItem(jTable2.getValueAt(r,0).toString());
          jComboBox2.setSelectedItem(jTable2.getValueAt(r,1).toString());
          jTextField2.setText(jTable2.getValueAt(r,2).toString());
          jLabel3.setText(jTable2.getValueAt(r,3).toString());
          jTextField3.setText(jTable2.getValueAt(r,4).toString());
          String s1 = (jTable2.getValueAt(r,9).toString());
          jLabel4.setIcon(ResizeImage(s1));
       
          
          String string= jTable2.getValueAt(r,5).toString();
          
         
          try {
            DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
             Date date1  = format.parse(string);
            jDateChooser1.setDate(date1);
        } catch (Exception e) {
            e.printStackTrace();
        }
          
          
          jTextField7.setText(jTable2.getValueAt(r,6).toString());
          jTextField5.setText(jTable2.getValueAt(r,7).toString());
          jTextArea1.setText(jTable2.getValueAt(r,8).toString());
        

    }//GEN-LAST:event_jTable2MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
         String Cus=jTextField6.getText();
        if(Cus.equals("") || Cus== null){
           JOptionPane.showMessageDialog(null,"Please Enter the Customer ID","Error in Cus_ID",JOptionPane.ERROR_MESSAGE);
           return;
       }
        else{
           tableload1(Cus); }
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
 
                        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
char c =evt.getKeyChar();
if(Character.isDigit(c)){


}else{
         JOptionPane.showMessageDialog(null, "Enter only Numeric Digits");
}// TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String filename=chooseFile();
            
        Document document=new Document(); 
        PdfWriter.getInstance(document,new FileOutputStream(filename+".pdf"));
          document.open();
          document.add(new Paragraph("----------------------------------------Customer Registration----------------------------------------")); 
          document.add(new Paragraph(" ")); 
          document.add(new Paragraph("Customer Type       " +":"+jComboBox1.getSelectedItem()));
          document.add(new Paragraph("Company Type        :"+jComboBox2.getSelectedItem()));
          document.add(new Paragraph("Full Name           :"+jTextField2.getText())); 
          document.add(new Paragraph("Customer ID         :"+jLabel3.getText())); 
          document.add(new Paragraph("Customer NIC        :"+jTextField3.getText())); 
          document.add(new Paragraph("Date                :"+jDateChooser1.getDate())); 
          document.add(new Paragraph("Tell No             :"+jTextField7.getText()));
          document.add(new Paragraph("Email               :"+jTextField5.getText())); 
          document.add(new Paragraph("Address             :"+jTextArea1.getText())); 
           document.close();
        JOptionPane.showMessageDialog(null,"Successfully Created.");
        } 
        catch (Exception e) {
             JOptionPane.showMessageDialog(null,"you have not create any file");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
            char c = evt.getKeyChar();
    if (Character.isDigit(c)) {
        
    } else {
        JOptionPane.showMessageDialog(null,"Enter only numeric digits","Error in Quantity", JOptionPane.ERROR_MESSAGE);
        
      
    }         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     try {
            Connection c= Software_Jframes.db.statement().getConnection();
        
            //String report = "";
            JasperDesign jd = JRXmlLoader.load("C:\\Users\\Asbar Ali\\Documents\\Building_Constructions\\src\\Ireports\\customer.jrxml");
            String sql = "select* from customer";
            JRDesignQuery newquery = new JRDesignQuery();
            newquery.setText(sql);
            jd.setQuery(newquery);
            JasperReport jr=JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,c);
            JasperViewer.viewReport(jp);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
   private String chooseFile() {
       JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename =f.getAbsolutePath();
        return filename;
    }

    
    
    
    
    private void tableload(String Cust_id) {
        
           DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
           dtm.setRowCount(0);
         try {
           ResultSet rs= db.getconnection().createStatement().executeQuery("select * from customer");
           
           while(rs.next()){
                 Vector v = new Vector();
         
            v.add(rs.getString("Cust_type"));
            v.add(rs.getString("Company_type"));
            v.add(rs.getString("Name"));
            v.add(rs.getString("Cust_id"));
            v.add(rs.getString("Cus_nic_Comp_no"));
            v.add(rs.getString("Date"));
            v.add(rs.getString("Telephone"));
            v.add(rs.getString("Email"));
            v.add(rs.getString("Address"));
            v.add(rs.getString("image"));
             dtm.addRow(v);
      
             
             
             
             
           }
    }
         catch(Exception e){
         e.printStackTrace();
         
         
    }
    }
    
    void tableload1(String Cus){
    
    DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
    dtm.setRowCount(0);
        try {
           ResultSet rs= db.getconnection().createStatement().executeQuery("select * from customer where Cust_id Like'%"+Cus+"%'");
              while(rs.next()){  
                Vector v = new Vector();
            v.add(rs.getString("Cust_type"));
            v.add(rs.getString("Company_type"));
            v.add(rs.getString("Name"));
            v.add(rs.getString("Cust_id"));
            v.add(rs.getString("Cus_nic_Comp_no"));
            v.add(rs.getString("Date"));
            v.add(rs.getString("Telephone"));
            v.add(rs.getString("Email"));
            v.add(rs.getString("Address"));
            v.add(rs.getString("image"));
             dtm.addRow(v);
            
           

              
              }
        
        }catch(Exception e){
            e.printStackTrace();
        }
}
    }

    
        
        
      
