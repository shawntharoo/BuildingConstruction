/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BOQ;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class retyp extends javax.swing.JInternalFrame {

    /**
     * Creates new form retyp
     */
    public retyp() {
        initComponents();
        
                try {
                Statement st= db.getconnection().createStatement();
                ResultSet r =  st.executeQuery("select * from section");
              
               while (r.next()) {
                jComboBox1.addItem(r.getString(1));
                
               }
               
           }  catch (Exception e) { 
                e.printStackTrace();}
        
        
         tableload();
         incnum();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resourse Type No", "Resourse Type Name", "Section", "Description"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Resourse Type");

        jLabel4.setText("Resourse Type No");

        jLabel2.setText("Resourse Type Name");

        jLabel3.setText("Description");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel5.setText("Section");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jTextField1)
                                    .addComponent(jComboBox1, 0, 141, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(42, 42, 42)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String rno=jLabel6.getText();
        String rname=jTextField1.getText();        
        String sec=jComboBox1.getSelectedItem().toString();
        String des=jTextArea1.getText();
        
        try {
            if(rname.isEmpty()){
            JOptionPane.showMessageDialog(null,"enter Resource name");
            }
            else if(sec == "select"){
                JOptionPane.showMessageDialog(null,"select Section");
            }
           
            else {
                Integer no = Integer.parseInt(rno);
                Integer secno = Integer.parseInt(sec);
                Statement st= db.getconnection().createStatement();
              st.executeUpdate("insert into resource_type (Resource_type_id,Resource_name,Description,Section_Sec_id) values ('"+no+"','"+rname+"','"+des+"','"+secno+"')");
              
              JOptionPane.showMessageDialog(null,"successfully added");
              
              tableload();
              clear();
              incnum();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int r =jTable1.getSelectedRow();
        
        if(r== -1){
            JOptionPane.showMessageDialog(null,"select a table row");
        }
        else{
            int x =JOptionPane.showConfirmDialog(null, "Do you want to delete this");
            if(x==0){
         try {
             
             
            String a=jTable1.getValueAt(r, 0).toString();
            
              Statement st= db.getconnection().createStatement();
              st.executeUpdate("DELETE from resource_type where Resource_type_id='"+a+"'");
              JOptionPane.showMessageDialog(null,"deleted successfully");
              
                
                tableload();
                clear();
                incnum();
                
        } catch (Exception e) {
            e.printStackTrace();
        }
        }}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int r =jTable1.getSelectedRow();
        
        if(r == -1){
            JOptionPane.showMessageDialog(null,"select a table row");
            
        }
        else{
              String rno=jLabel6.getText();
        String rname=jTextField1.getText();        
        String sec=jComboBox1.getSelectedItem().toString();
        String des=jTextArea1.getText();
        
        try {
            
            if(rno.isEmpty()){
            JOptionPane.showMessageDialog(null,"enter id");
            }
            
            else if(rname.isEmpty()){
            JOptionPane.showMessageDialog(null,"enter name");
            }
            else if(sec == "select"){
                JOptionPane.showMessageDialog(null,"select Section");
            }
            
            else{
                
              
              Statement st= db.getconnection().createStatement();
              st.executeUpdate("update resource_type set Resource_name='"+rname+"',Section_Sec_id='"+sec+"',Description='"+des+"' where Resource_type_id='"+rno+"'");
              
              JOptionPane.showMessageDialog(null,"successfully updated");
                           
              tableload();
              clear();
              incnum();
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        
        }    
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        selectrow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               clear();
               incnum();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

public  void tableload(){
           
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
         try {
           ResultSet rs= db.getconnection().createStatement().executeQuery("select * from resource_type");
           
           while(rs.next()){
                 Vector v = new Vector();
         
            v.add(rs.getString("Resource_type_id"));
            v.add(rs.getString("Resource_name"));
            v.add(rs.getString("Section_Sec_id"));
            v.add(rs.getString("Description"));
                                 
             dtm.addRow(v);
             
             
      
           }
    }
         catch(Exception e){
         e.printStackTrace();
         
         }

    }
public void selectrow(){
 
 try {
            int r =jTable1.getSelectedRow();
            String a=jTable1.getValueAt(r, 0).toString();
            
           Statement st= db.getconnection().createStatement();
           ResultSet ss =st.executeQuery("SELECT * FROM resource_type WHERE Resource_type_id='"+a+"' ");
               
                
            while(ss.next())
            {
                String no=ss.getString(1);
                String na=ss.getString(2);
                String de=ss.getString(3);
                String se=ss.getString(4);
                
                jLabel6.setText(no);
                jTextField1.setText(na);
                jComboBox1.setSelectedItem(se);
                jTextArea1.setText(de);
            }
                
        } catch (Exception e) {
            e.printStackTrace();
        }
 
 }
public void clear(){

                jLabel6.setText(null);
                jTextField1.setText(null);
                jTextArea1.setText(null);
                jComboBox1.setSelectedIndex(0);

}

public void incnum(){


        try {
            Statement st= db.getconnection().createStatement();
            
            ResultSet sp =st.executeQuery("SELECT COUNT(*) AS RowCnt FROM resource_type");
            
            while(sp.next()){
                String nm=sp.getString(1);
                int x =Integer.parseInt(nm);
                
                
                if(x==0){
                jLabel6.setText("001");
                }
                else{
                
                ResultSet ss =st.executeQuery("SELECT MAX(Resource_type_id) FROM resource_type");
            
            while(ss.next())
            {
                String no=ss.getString(1);
                
                int nu=Integer.parseInt(no);
                nu=++nu;
                String var = String.format("%03d", nu);

                jLabel6.setText(var);
            }
                
                }
                
                break;
            }
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }


}
}
