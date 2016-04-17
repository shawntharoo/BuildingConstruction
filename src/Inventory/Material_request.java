/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import test_new.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import javax.swing.JFileChooser;
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
 * @author demo
 */
public class Material_request extends javax.swing.JInternalFrame {

    /**
     * Creates new form Material_request
     */
    public Material_request() {
        initComponents();
      //  date();
        
        Random ran =new Random();
        int n=ran.nextInt(5000)+7;
        jLabel14.setText(n+"");
    }
     public void tableload(){
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
         try {
           ResultSet rs= db.getconnection().createStatement().executeQuery("select * from material_request_note");
           
           while(rs.next()){
                 Vector v = new Vector();
         
            v.add(rs.getString("Mat_no"));
            v.add(rs.getString("Mat_sub_cat_no"));
            v.add(rs.getString("Mat_name"));
            v.add(rs.getString("Unit_amount"));
            v.add(rs.getString("require_date"));
            v.add(rs.getString("description"));
            v.add(rs.getString("store_keeper_job_id"));
            v.add(rs.getString("curr_date"));

            
            
             dtm.addRow(v);
      
           }
         }
         catch(Exception e){
         e.printStackTrace();
         
         }
        
        }
      void tableload(String mat_sub_cat){
    
    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        try {
           ResultSet rs= db.getconnection().createStatement().executeQuery("select * from material_request_note where Mat_sub_cat_no Like'%"+mat_sub_cat+"%'");
              while(rs.next()){  
                Vector v = new Vector();
                
            v.add(rs.getString("Mat_no"));
            v.add(rs.getString("Mat_sub_cat_no"));
            v.add(rs.getString("Mat_name"));
            v.add(rs.getString("Unit_amount"));
            v.add(rs.getString("require_date"));
            v.add(rs.getString("description"));
            v.add(rs.getString("store_keeper_job_id"));
            v.add(rs.getString("curr_date"));

            
            dtm.addRow(v);

              
              }
        
        }catch(Exception e){
            e.printStackTrace();
        }
      }

//    public void date(){
//        Date d = new Date();
//        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
//       
//        jLabel11.setText(sd.format(d));
//    }
    
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Material  Request");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 380, 40));

        jLabel2.setText("Current Date :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setText("Material Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel4.setText("Unit Amount :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setText("Require Date :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel6.setText("Material No :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel7.setText("Material Sub Cat No :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel8.setText("Store Keeper Job Id :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel9.setText("Description :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 200, -1));

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 200, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, -1));

        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField7MouseEntered(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 200, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextArea1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 200, 100));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("View Material Request Details");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 920, 40));

        jToggleButton1.setText("search");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 120, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material No", "Material Sub No", "Material name", "Unit amount", "Require Date", "Description", "Store keeper job id", "Current Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 910, 390));

        jToggleButton3.setText("Clear");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 530, 120, 30));

        jToggleButton4.setText("Update");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 120, 30));

        jToggleButton5.setText("Print  PDF Report");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 120, 30));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 200, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 200, -1));

        jLabel12.setText("Material Sub Cat No :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 140, 20));

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 120, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 20, 640));

        jButton2.setText("view");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 120, 30));

        jLabel13.setText("Material request note No: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 140, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 200, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "910", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 190, -1));

        jButton3.setText("Print Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 530, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1343, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if((jTextField2.getText().isEmpty()) || (jTextField3.getText().isEmpty()) ||(jDateChooser2.getDateFormatString().isEmpty()) || (jTextField6.getText().isEmpty())||(jTextField7.getText().isEmpty()) || (jTextArea1.getText().isEmpty())){
        
            JOptionPane.showMessageDialog(null, "enter the correct values in textfield","Error in Text field",JOptionPane.ERROR_MESSAGE); 
        }
        
        else{
        String Mat_name=jTextField2.getText();
        String u_amount=jTextField3.getText();
        String mat_sub_cat=jTextField6.getText();
        String s_kid=jTextField7.getText();
        String mat_no=jComboBox1.getSelectedItem().toString();
        String des=jTextArea1.getText();
        Date requ=jDateChooser2.getDate();
//        
        Date cur = jDateChooser1.getDate();
        String mrn_no=jLabel14.getText();
//        
        SimpleDateFormat sdm = new SimpleDateFormat("yyyy-MM-dd");
        String date= sdm.format(requ);
        
        
        SimpleDateFormat sdm1 = new SimpleDateFormat("yyyy-MM-dd");
        String date1= sdm1.format(cur);
//          
         try {
            db.getconnection().createStatement().executeUpdate("insert into `mydb`.`material_request_note` (Mat_no, Mat_sub_cat_no, Mat_name, Unit_amount, require_date, description, store_keeper_job_id, curr_date,MRN_NO)"
                    + " values('"+mat_no+"','"+mat_sub_cat+"','"+Mat_name+"','"+u_amount+"','"+date+"','"+des+"','"+s_kid+"','"+date1+"','"+mrn_no+"')");
             JOptionPane.showMessageDialog(null,"Successfully Saved","Success Message",JOptionPane.INFORMATION_MESSAGE);
             
               jTextField2.setText(null);
            jTextField3.setText(null);
            jTextField6.setText(null);
            jTextField7.setText(null);
            jComboBox1.setSelectedItem(null);
            jTextArea1.setText(null);
            
            
            jDateChooser2.setDateFormatString(null);
            jDateChooser1.setDateFormatString(null);
            
            
            Random ran =new Random();
            int n=ran.nextInt(5000)+7;
            jLabel14.setText(n+"");
             
             
        } catch (Exception e) {
            e.printStackTrace();
        }
           DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
         dtm.setRowCount(0);
        tableload();
          
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
         String Mat_name=jTextField2.getText();
        String u_amount=jTextField3.getText();
        String mat_sub_cat=jTextField6.getText();
        String s_kid=jTextField7.getText();
        String mat_no=jComboBox1.getSelectedItem().toString();
        String des=jTextArea1.getText();
        Date requ=jDateChooser2.getDate();
        Date cur = jDateChooser1.getDate();
        
        SimpleDateFormat sdm = new SimpleDateFormat("yyyy-MM-dd");
          String date= sdm.format(requ);
           SimpleDateFormat sdm1 = new SimpleDateFormat("yyyy-MM-dd");
           String date1= sdm1.format(cur);
          try {
                Statement st= db.getconnection().createStatement();
                st.executeUpdate("update material_request_note set Mat_no='"+ mat_no+"',Mat_sub_cat_no='"+mat_sub_cat+"',Mat_name='"+Mat_name+"',Unit_amount='"+u_amount+"',require_date='"+date+"',description='"+des+"',store_keeper_job_id='"+s_kid+"',curr_date='"+date1+"' where Mat_sub_cat_no='"+mat_sub_cat+"'");
               JOptionPane.showMessageDialog(null,"Successfully update,,,");
             
            
        } catch (Exception e) {
             e.printStackTrace();
        }
         DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
         dtm.setRowCount(0);
        tableload();
        
        
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
       
         String mat_sub_cat=jTextField6.getText();
        
           if(mat_sub_cat.equals("")|| mat_sub_cat.equals(null)){
            JOptionPane.showMessageDialog(null, "Please select the relevant row","Error selection", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int x=JOptionPane.showConfirmDialog(null, "Do you want to delete this");
       
       if(x==0){
       
           try {
               com.mysql.jdbc.Statement st= (com.mysql.jdbc.Statement) db.getconnection().createStatement();
               st.executeUpdate("DELETE from material_request_note where Mat_sub_cat_no='"+mat_sub_cat+"'");
               JOptionPane.showMessageDialog(null,"Successfully Deleted,,,");
           } catch (Exception e) {
               e.printStackTrace();
           }
       
       }
       DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       dtm.setRowCount(0);
       tableload();
         
        
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        int r=jTable1.getSelectedRow();
        
          String Mat_name=jTable1.getValueAt(r, 2).toString();
         String mat_no=jTable1.getValueAt(r, 0).toString();
         String mat_sub_cat=jTable1.getValueAt(r, 1).toString();
         String u_amount=jTable1.getValueAt(r, 3).toString();
         String date=jTable1.getValueAt(r, 4).toString();
         String date1=jTable1.getValueAt(r, 7).toString();
         String des=jTable1.getValueAt(r, 5).toString();
         String s_kid=jTable1.getValueAt(r, 6).toString();
        
         
         jTextField2.setText(Mat_name);
         jComboBox1.setSelectedItem(mat_no);
        jTextField6.setText(mat_sub_cat);
        jTextField3.setText(u_amount);
//       jDateChooser1.setDateFormatString(date1);
//        jDateChooser2.setDateFormatString(date);
        jTextArea1.setText(des);
        jTextField7.setText(s_kid);
        
        jLabel14.setVisible(false);
        jLabel13.setVisible(false);
        jTextField6.setVisible(false);
        jLabel7.setVisible(false);
          try {
            DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            Date ddate=format.parse(date);
            jDateChooser2.setDate(ddate);
            DateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
            Date rdate=format1.parse(date1);
            jDateChooser1.setDate(rdate);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      
        String mat_sub_cat=jTextField6.getText();
        
        if(mat_sub_cat.equals("") ||mat_sub_cat.equals(null)){
           JOptionPane.showMessageDialog(null,"Please Enter the Mat_sub_cat_no","Error in Sub_cat_no",JOptionPane.ERROR_MESSAGE);
           return;
       }
           DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
           tableload(mat_sub_cat); 
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
         dtm.setRowCount(0);
        
         tableload();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
      
                      char c = evt.getKeyChar();
    if (Character.isDigit(c)) {
        
    } else {
        JOptionPane.showMessageDialog(null,"Enter only numeric digits","Error in Unit Amount", JOptionPane.ERROR_MESSAGE);
        
    } 
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
       
        try {
            String filename=chooseFile();
            
        Document document=new Document(); 
        PdfWriter.getInstance(document,new FileOutputStream(filename+".pdf"));
          document.open();
          document.add(new Paragraph("----------------------------------------Material Request Note----------------------------------------")); 
          document.add(new Paragraph(" ")); 
          document.add(new Paragraph("Material Request Note No       :"+jLabel14.getText()));
          document.add(new Paragraph("Current Date                   :"+jDateChooser1.getDate()));
          document.add(new Paragraph("Material Name                  :"+jTextField2.getText())); 
          document.add(new Paragraph("Unit Amount                    :"+jTextField3.getText())); 
          document.add(new Paragraph("Material Sub Cat No            :"+jTextField6.getText())); 
          document.add(new Paragraph("Store Keeper Job Id            :"+jTextField7.getText())); 
          document.add(new Paragraph("Require Date                   :"+jDateChooser2.getDate()));
          document.add(new Paragraph("Material No                    :"+jComboBox1.getSelectedItem())); 
          document.add(new Paragraph("Description                    :"+jTextArea1.getText())); 
           document.close();
        JOptionPane.showMessageDialog(null,"Successfully Created.");
        } 
        catch (Exception e) {
             JOptionPane.showMessageDialog(null,"you have not create any file");
        }
        
        
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jTextField7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseEntered
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_jTextField7MouseEntered

    private void jTextArea1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseEntered
        
          Date  date=jDateChooser2.getDate();
        SimpleDateFormat sdm = new SimpleDateFormat("yyyy");
        String dateY= sdm.format(date);
        SimpleDateFormat sdm1 = new SimpleDateFormat("MM");
        String dateM= sdm1.format(date);
        SimpleDateFormat sdm2 = new SimpleDateFormat("dd");
        String dateD= sdm2.format(date);
        System.out.println(dateY+" "+dateM+" "+dateD);
        //----------------------------//
        Date  date1=jDateChooser1.getDate();
        SimpleDateFormat sdm3 = new SimpleDateFormat("yyyy");
        String date1Y= sdm3.format(date1);
        SimpleDateFormat sdm4 = new SimpleDateFormat("MM");
        String date1M= sdm4.format(date1);
        SimpleDateFormat sdm5 = new SimpleDateFormat("dd");
        String date1D= sdm5.format(date1);
        System.out.println(date1Y+" -  "+date1M+" -  "+date1D);
        int dateYY=Integer.parseInt(dateY);
        int dateMM=Integer.parseInt(dateM);
        int dateDD=Integer.parseInt(dateD);
          int date1YY=Integer.parseInt(date1Y);
          int date1MM=Integer.parseInt(date1M);
          int date1DD=Integer.parseInt(date1D);
                  
                  
        if( (date1YY <= dateYY) && (date1MM <= dateMM) && (date1DD < dateDD) ){
        
        System.out.println("lol1");
        }
        else{
        
          JOptionPane.showMessageDialog(null, "Please enter the Correct Date","Error in Date", JOptionPane.ERROR_MESSAGE);       
       // System.out.println("lal");
                }
        
    }//GEN-LAST:event_jTextArea1MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
          String Mat_sub_cat=jTextField6.getText();
        try {
            Connection c= Software_Jframes.db.statement().getConnection();
        
            //String report = "";
            JasperDesign jd = JRXmlLoader.load("C:\\Users\\Asbar Ali\\Documents\\Building_Constructions\\src\\Ireports\\MRN1.jrxml");
            String sql = "select* from material_request_note group by '"+Mat_sub_cat+"'";
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
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    // End of variables declaration//GEN-END:variables

   private String chooseFile() {
       JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename =f.getAbsolutePath();
        return filename;
    }

}
