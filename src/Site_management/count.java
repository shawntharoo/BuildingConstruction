/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Site_management;

import java.sql.ResultSet;

/**
 *
 * @author AKLive
 */
public class count {
   
   
    public static int getcount(){
        
        int i=0;
        try {
            ResultSet rs= db.getconnection().createStatement().executeQuery("select count(id) from con_sites");
            if(rs.next()){
                i= rs.getInt(1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}
