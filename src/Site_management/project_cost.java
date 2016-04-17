/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Site_management;

import java.sql.ResultSet;
import javax.swing.JLabel;

/**
 *
 * @author Asbar Ali
 */
public class project_cost {
    public int getToday_cost(String pid,String date){
        int cost=0;
        try {
            ResultSet rs= db.getconnection().createStatement().executeQuery("select cost from project_level_payment where projectid='"+pid+"' and date='"+date+"'");
            
            while(rs.next()){
              String cost_str= (rs.getString("cost"));
              int cost_tmp= Integer.parseInt(cost_str);
              cost = cost+cost_tmp;
            }
        } catch (Exception e) {       
        }
        return cost;
    }
    
     public int total_cost(String pid){
        int cost=0;
        try {
            ResultSet rs= db.getconnection().createStatement().executeQuery("select cost from project_level_payment where projectid='"+pid+"'");
            
            while(rs.next()){
              String cost_str= (rs.getString("cost"));
              int cost_tmp= Integer.parseInt(cost_str);
              cost = cost+cost_tmp;
            }
            
        } catch (Exception e) {
            
        }
        return cost;
    }
     
     
    
}
