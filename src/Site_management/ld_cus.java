/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Site_management;

import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author Asbar Ali
 */
public class ld_cus {
    
    public void lc(JComboBox jComboBoxcus){
    
      jComboBoxcus.removeAllItems();
        try {
            ResultSet rs=  db.getconnection().createStatement().executeQuery("select Cust_id from customer");
            
            while(rs.next()){
                jComboBoxcus.addItem(rs.getInt("Cust_id"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    
    
    
    
    }
    
}
