/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Site_management;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author AKLive
 */
public class Update_project extends javax.swing.JFrame {

    /**
     * Creates new form Update_project
     */
    public Update_project() {
        initComponents();
         ld_cus lc1 = new ld_cus();
        lc1.lc(jComboBoxcus);
        loaddata();
        loadlevel();
        loadimg();
        loadcl();
       
       
               
    }
    
    public ImageIcon ResizeImage (String ImagePath,JLabel label){
        ImageIcon myimage = new ImageIcon(ImagePath);
        Image img = myimage.getImage();
        Image newimg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(newimg);
        return image;
    }
    
    public ImageIcon ResizeImage (String ImagePath){
        ImageIcon Myimage = new ImageIcon(ImagePath); Image img = Myimage.getImage();
        Image newImg = img.getScaledInstance(jLabel19.getWidth(), jLabel19.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(newImg);
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

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        sesfield = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBoxcus = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 200, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("UPDATE PROJECT");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 140, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACTIVE", "INACTIVE", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 75, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 200, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 290, 110));

        jLabel6.setText("Remarks:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 60, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "From The Scratch", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 200, -1));

        jLabel8.setText("Construction Mode");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 100, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Apartment", "House", "Building", "Shop", "WareHouse", "Other" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 200, -1));

        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField7MouseEntered(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 200, -1));

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 200, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SquareKilometers[km2]", "SquareMeters[m2]", "SquareFeet[ft2]", "SquareYards[yd2]", "Acres[ac]", "Hectares[ha]" }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 200, 20));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, 110));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 200, -1));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 200, -1));

        jLabel10.setText("Progress :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 100, -1));

        jLabel25.setText("Current Session");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 130, -1));
        jPanel1.add(sesfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 200, 20));

        jLabel12.setText("Change Project Image:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, 20));

        jLabel13.setText("Change CAD Drawing:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, 20));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empty-image.png"))); // NOI18N
        jLabel19.setText("Add Image here");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 190, 160));

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 60, 20));

        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 60, 20));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empty-image.png"))); // NOI18N
        jLabel20.setText("Add Image here");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 190, 160));

        jLabel22.setText("jLabel22");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 190, 20));

        jLabel16.setText("Est. completion Date");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 110, 20));

        jLabel5.setText("Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel2.setText("Location/Area");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 90, -1));

        jLabel1.setText("Project Name ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, -1));

        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 50, -1));

        jLabel3.setText("Customer ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, -1));

        jLabel7.setText("Construction Type");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, 20));

        jLabel9.setText("Number of levels");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 110, -1));

        jLabel18.setText("Scale of cons.Area ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 110, -1));

        jLabel11.setText("Actual Start Date  ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, -1));

        jLabel26.setText(":");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 10, -1));

        jLabel27.setText(":");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 10, -1));

        jLabel28.setText(":");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 10, -1));

        jLabel29.setText(":");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 10, -1));

        jLabel30.setText(":");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 10, -1));

        jLabel31.setText(":");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 10, 20));

        jLabel32.setText(":");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 10, 20));

        jLabel33.setText(":");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 10, 20));

        jLabel34.setText(":");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 10, 20));

        jLabel35.setText(":");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 10, 20));

        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 510, 120, 30));

        jLabel15.setText("Completion status :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 100, 20));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "on going", "completed" }));
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, 75, -1));

        jLabel36.setText("Daily update image :");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 120, 20));

        jLabel37.setText("jLabel23");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 190, 20));

        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 200, -1));

        jLabel38.setText(":");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 10, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Completed levels");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 60, -1));

        jLabel23.setText("jLabel23");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 190, 20));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empty-image.png"))); // NOI18N
        jLabel21.setText("                    Add Image here");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 240, 440));

        jComboBoxcus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxcusActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1333, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        JFileChooser file1 = new JFileChooser();
        FileNameExtensionFilter filter1 = new FileNameExtensionFilter(
            "JPEG & GIF Images", "jpg", "gif");
        file1.setFileFilter(filter1);
        int result = file1.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION){

            File selectedFile = file1.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            // type jlabel to show path

            JLabel label = jLabel19;

            jLabel22.setText(path);
            jLabel19.setIcon(ResizeImage(path, label));

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JFileChooser file1 = new JFileChooser();
        FileNameExtensionFilter filter1 = new FileNameExtensionFilter(
            "JPEG & GIF Images", "jpg", "gif");
        file1.setFileFilter(filter1);
        int result = file1.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION){

            File selectedFile = file1.getSelectedFile();
            String path = selectedFile.getAbsolutePath();

            JLabel label = jLabel20;

            jLabel20.setIcon(ResizeImage(path,label));
            jLabel37.setText(path);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Date todaydate = new Date();
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
               
        String tdy= (dateFormat.format(todaydate));
        
         String name= jTextField1.getText();
        String area= jTextField2.getText();
        String Cust_id= jComboBoxcus.getSelectedItem().toString();
        String address= jTextArea2.getText();
        String status= jComboBox1.getSelectedItem().toString();
        String type= jComboBox2.getSelectedItem().toString();
        String mode= jComboBox3.getSelectedItem().toString();
        String levels= jTextField7.getText();
        String scl_sub1= jTextField6.getText();
        String scl_sub2= jComboBox4.getSelectedItem().toString();
        String scl= scl_sub1+" "+scl_sub2;
       
        String remarks=  jTextArea1.getText();
        
        String prgimg= jLabel22.getText();
        String cadimg= jLabel37.getText();
        String crimg = jLabel23.getText();
         cadimg= cadimg.replace("\\", "/");
        prgimg= prgimg.replace("\\", "/");
        crimg= crimg.replace("\\", "/");
        
        
        String cstat= jComboBox5.getSelectedItem().toString();
        String ses1= sesfield.getText();
        
        
        //
        Date d= jDateChooser1.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date= sdf.format(d);
        
        Date d1= jDateChooser2.getDate();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String date1= sdf1.format(d1);
        
        
                                                                                   
        try {
            String sp= jComboBox6.getSelectedItem().toString();
            String array[]= sp.split(" ");
            String str = array[1];
            
            db.getconnection().createStatement().executeUpdate(" UPDATE con_sites SET name='"+ name +"', location='"+ area +"', cust_id='"+ Cust_id +"', "
                    + "address='"+ address +"', status='"+ status +"', type='"+ type +"',est_comp_date='"+ date +"', mode='"+ mode +"', no_levels='"+ levels +"',"
                    + "act_star_date='"+date1+"', scl_area='"+ scl +"', remarks='"+ remarks +"', pro_img='"+prgimg+"', 3D_img='"+cadimg+"', compl_stat='"+cstat+"', session='"+ses1+"', com_lvls='"+str+"'   where id='"+conall.num+"'");
           
            db.getconnection().createStatement().executeUpdate(" INSERT into uimages(id, img, date) values ('"+conall.num+"', '"+crimg+"', '"+tdy+"') ");
            JOptionPane.showMessageDialog(null,"Successfully Saved", "Update Message", JOptionPane.INFORMATION_MESSAGE );
       
        
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }
          
        
          this.setVisible(false); //this will close frame i.e. NewJFrame

            new project_dashboards().setVisible(true);


// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

         JFileChooser file1 = new JFileChooser();
        FileNameExtensionFilter filter1 = new FileNameExtensionFilter(
            "JPEG & GIF Images", "jpg", "gif");
        file1.setFileFilter(filter1);
        int result = file1.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION){

            File selectedFile = file1.getSelectedFile();
            String path = selectedFile.getAbsolutePath();

            JLabel label = jLabel20;

            jLabel21.setIcon(ResizeImage(path,label));
            jLabel23.setText(path);
        }
        

        


// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBoxcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxcusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxcusActionPerformed

    private void jTextField7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseEntered

 Date  rdate=jDateChooser1.getDate();
        SimpleDateFormat sdm = new SimpleDateFormat("yyyy");
        String rdateY= sdm.format(rdate);
        SimpleDateFormat sdm1 = new SimpleDateFormat("MM");
        String rdateM= sdm1.format(rdate);
        SimpleDateFormat sdm2 = new SimpleDateFormat("dd");
        String rdateD= sdm2.format(rdate);
        System.out.println(rdateY+" "+rdateM+" "+rdateD);
        //----------------------------//
        Date  ddate=jDateChooser2.getDate();
        SimpleDateFormat sdm3 = new SimpleDateFormat("yyyy");
        String ddateY= sdm3.format(ddate);
        SimpleDateFormat sdm4 = new SimpleDateFormat("MM");
        String ddateM= sdm4.format(ddate);
        SimpleDateFormat sdm5 = new SimpleDateFormat("dd");
        String ddateD= sdm5.format(ddate);
        System.out.println(ddateY+" -  "+ddateM+" -  "+ddateD);
        int rdateYY=Integer.parseInt(rdateY);
        int rdateMM=Integer.parseInt(rdateM);
        int rdateDD=Integer.parseInt(rdateD);
          int ddateYY=Integer.parseInt(ddateY);
          int ddateMM=Integer.parseInt(ddateM);
          int ddateDD=Integer.parseInt(ddateD);
                  
                  
        if( (ddateYY >= rdateYY) && (ddateMM >= rdateMM) && (ddateDD > rdateDD) ){
        
       JOptionPane.showMessageDialog(null, "The completion date should be Later than start date");
            
        }
        else{
        
                
        System.out.println("lal");
                }
        

// TODO add your handling code here:
    }//GEN-LAST:event_jTextField7MouseEntered

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed

          char c = evt.getKeyChar();
  if ((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE))) {
        
    } else {
        JOptionPane.showMessageDialog(null,"Enter only numeric digits(0-9)");
        
      
    } 
        

// TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed

        
         char c = evt.getKeyChar();
  if ((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE))) {
        
    } else {
        JOptionPane.showMessageDialog(null,"Enter only numeric digits(0-9)");
        
      
    }        


// TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyPressed

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
            java.util.logging.Logger.getLogger(Update_project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBoxcus;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField sesfield;
    // End of variables declaration//GEN-END:variables

private void loaddata() {
        try {
            ResultSet rs= db.getconnection().createStatement().executeQuery("select * from con_sites where id = '"+ conall.num +"' and compl_stat = 'on going' ");
            while(rs.next()){
                
              int ns = rs.getInt("Cust_id");  
                System.out.println(ns +"customer");
              jTextField2.setText(rs.getString("location"));
              jTextArea2.setText(rs.getString("address"));
              
             
          
              
              
                jComboBox2.setSelectedItem(rs.getString("type"));
                jComboBox2.setSelectedItem(rs.getString("mode"));
                jComboBox1.setSelectedItem(rs.getString("status"));
//              
                jTextField1.setText(rs.getString("name"));
                jTextField7.setText(rs.getString("no_levels"));
                jComboBoxcus.setSelectedItem(ns);
                jDateChooser1.setDate(rs.getDate("est_comp_date"));
                jDateChooser2.setDate(rs.getDate("act_star_date"));
                jComboBox5.setSelectedItem(rs.getString("compl_stat"));
                sesfield.setText(rs.getString("session"));

             try{   
              String gtt = (rs.getString("scl_area"));
                
                String[] gt1 = gtt.split(" ");
                
                String s1 = gt1[0];
                String s2 = gt1[1];
                
                jTextField6.setText(s1);
                jComboBox4.setSelectedItem(s2);
                
                 System.out.println(s1);
                 System.out.println(s2);
                
                jTextArea1.setText(rs.getString("remarks"));
                
                
//                
//                jLabel42.setIcon(ResizeImage(rs.getString("pro_img"),jLabel42));
//                
            
             
             }catch(Exception e1){
             
                 System.out.println(e1);
             
             }
             
             
             
             
             }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadlevel() {
      
         int n=0;
            try {
                ResultSet rs= db.getconnection().createStatement().executeQuery("select no_levels from con_sites where id='"+conall.num+"'");
                if(rs.next()){
                    n = rs.getInt("no_levels");
                    System.out.println(n);
                }
                
                for (int j=0;j<n;j++){
                    jComboBox6.addItem("Level "+j);
                }
               
            } catch (Exception e) {
                e.printStackTrace();
            }
           
      
    }

    private void loadimg() {
        
        
        try {
            
            ResultSet rs45= db.getconnection().createStatement().executeQuery("select * from con_sites where id = '"+ conall.num +"' ");
            while(rs45.next()){
            
            String primg= rs45.getString("pro_img");
                
             //   String primg=("C:\\Users\\AKLive\\Pictures\\ConvergeUI.jpg");
                System.out.println(primg);
            jLabel19.setIcon(ResizeImage(primg));
            jLabel22.setText(primg);
            
            String cadimg= rs45.getString("3D_img");
                System.out.println(cadimg);
            jLabel20.setIcon(ResizeImage(cadimg));
            jLabel37.setText(cadimg);
            
            
            
            
            
            }
            
            
            ResultSet rs46= db.getconnection().createStatement().executeQuery("select img from uimages where id = '"+ conall.num +"' ");
            
            while(rs46.next()){
            
             String cr1=rs46.getString("img");
                
            jLabel21.setIcon(ResizeImage(cr1));
            jLabel23.setText(cr1);
            
            }
            
            
            
            
        } catch (Exception e) {
        }
        
        
        
        
        
        
    }

    private void loadcl() {
        
        try {
            
             ResultSet rs= db.getconnection().createStatement().executeQuery("select com_lvls from con_sites where id = '"+ conall.num +"'  ");
           
            
            if(rs.next()){
              
              String setitm=(rs.getString("com_lvls"));
               
              jComboBox6.setSelectedItem("Level "+setitm);
          
            
            
            }
            
            
            
        } catch (Exception e) {
        }
     
    
    
    }

}
