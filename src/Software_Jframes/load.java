
package Software_Jframes;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class load {
    
    // CUSTOMER
      void customer_id(JComboBox jComboBox3) {
       try {
             ResultSet rs= db.statement().executeQuery("select distinct Cust_id from con_sites");
             
             while(rs.next()){
                 jComboBox3.addItem(rs.getString("Cust_id"));
                 
             }
    
        } catch (Exception e) {
            e.printStackTrace();
        }  }

   
    
    
    
    
    
    // VIEW PROJECT STATUS
    
    void load_table_cost(JComboBox jComboBox1,JComboBox jComboBox2,JTable jTable5,JTextField jTextField27) {
    try {
        
        String prject= jComboBox1.getSelectedItem().toString();
            
        String levels= jComboBox2.getSelectedItem().toString();
        
        
        DefaultTableModel dtm = (DefaultTableModel) jTable5.getModel();
        dtm.setRowCount(0);
        ResultSet rs;
      
             if(levels.equals("") || levels.equals(null)){
            rs= db.statement().executeQuery("select * from project_level_payment,con_sites"
                        + " where con_sites.id=project_level_payment.projectid and id='"+prject+"' ");
            
               }else{
            rs= db.statement().executeQuery("select * from project_level_payment,con_sites"
                        + " where con_sites.id=project_level_payment.projectid and id='"+prject+"' and project_level_payment.level='"+levels+"' ");
             }
                
               double total=0;
                while(rs.next()){
                    Vector v = new Vector();
                    int n = rs.getInt("id");
                    String name = rs.getString("project_level_payment.name");  
                    String level= rs.getString("con_sites.name");
                    String cost = rs.getString("Cust_id");
                    double cost_double = Double.parseDouble(cost);
                    total = total+cost_double;
                    
                    v.add(level);
                    v.add(name);
                    v.add(cost); 

                    dtm.addRow(v);   
                }
                
                
                jTextField27.setText(total+"");
        } catch (Exception e) {
           
        } }

    void load_project_ids(JComboBox jComboBox1) {
      try {
               jComboBox1.removeAllItems();
     
            ResultSet rs= db.statement().executeQuery("select id from con_sites");
            while(rs.next()){
                jComboBox1.addItem(rs.getString("id"));
            }
        } catch (Exception e) {
        } }

    void load_level_from_project(JComboBox jComboBox1,JComboBox jComboBox2,JLabel jLabel12) {
    int i=0;
        try {
            String pid= jComboBox1.getSelectedItem().toString();
            jComboBox2.removeAllItems();
            int a = Integer.parseInt(pid);
            jLabel12.setText(a+"");
            
            ResultSet rs= db.statement().executeQuery("select no_levels from con_sites where id="+a+"");
            while(rs.next()){
                i = rs.getInt("no_levels");
               
            }
            for(int j=1;j<=i;j++){
               
                jComboBox2.addItem("Level "+j);
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }  }

    void loadpayment_history(JTable jTable1) {
        try {
            ResultSet rs= db.statement().executeQuery("select * from cus_payment");
            
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            
            while(rs.next()){
                Vector v = new Vector();
               v.add(rs.getString("Cust_no"));
               v.add(rs.getString("Project_id"));
               v.add(rs.getString("Project_status"));
               v.add(rs.getString("Project_level"));
               v.add(rs.getString("Amount"));
               v.add(rs.getString("Date"));
            
               dtm.addRow(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  

  
    
}
