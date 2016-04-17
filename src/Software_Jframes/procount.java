/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Software_Jframes;

import java.sql.ResultSet;

/**
 *
 * @author AKLive
 */
public class procount {
    
    
    public static float unival(int pid, int ccount){
        int n=0;
        float unit1=0;
        float unit=0;
        try {
            ResultSet rs=  db.statement().executeQuery("select no_levels from con_sites where id='"+pid+"'");
            if(rs.next()){
                n= rs.getInt("no_levels");
                
                 unit1 = 100/(n);
                 
                 unit = unit1*ccount;
                 
                 
            } 
            
            
        } catch (Exception e) {
        }
       
    
        return unit;
    }
    
    
    
}
