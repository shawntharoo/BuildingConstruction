/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Site_management;

import java.sql.ResultSet;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Asbar Ali
 */
public class ld_wrkrs {
    
    public void ldeng(JTable jtable){
        
        try {
            
     
            
      ResultSet rs932= db.getconnection().createStatement().executeQuery("select id, name, lname, EID, contact, wrking_hrs, specialization from assinged_eng where id='"+conall.num+"' ");
    
     
     jtable.setModel(DbUtils.resultSetToTableModel(rs932));
                  
            
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    
    }

    
     public void ldsup(JTable jtable){
        
        try {
            
     
            
      ResultSet rs932= db.getconnection().createStatement().executeQuery("select id, name, lname, EID, contact, wrking_hrs, job_type from assinged_sup where id='"+conall.num+"' ");
    
     
     jtable.setModel(DbUtils.resultSetToTableModel(rs932));
                  
            
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    
    }

    

}
