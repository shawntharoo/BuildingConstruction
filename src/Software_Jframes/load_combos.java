/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Software_Jframes;

import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author Asbar Ali
 */
public class load_combos {
    public void project_cost_delete(JComboBox jComboBox2,JComboBox jComboBox1,JComboBox jComboBox3){
        try {
            String project= jComboBox2.getSelectedItem().toString();
            String level = jComboBox1.getSelectedItem().toString();
            jComboBox3.removeAllItems();
            
            ResultSet rs= db.statement().executeQuery("select idproject_level_payment,date from project_level_payment where projectid='"+project+"' and level='"+level+"' ");
            while(rs.next()){
                String pid_level_pay = rs.getString("idproject_level_payment");
                String date= rs.getString("date");
                
               jComboBox3.addItem(pid_level_pay+"-"+date);
                
                
            
            }
                
                
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
