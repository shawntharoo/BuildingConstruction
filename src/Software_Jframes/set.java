/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Software_Jframes;

import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;

/**
 *
 * @author Asbar Ali
 */
public class set {

    // VIEW PROJECT STATUS
    
    void set_project_progress(JComboBox jComboBox1,JProgressBar jProgressBar1) {
     String project= jComboBox1.getSelectedItem().toString();
           
        try {
            float s=0;
        ResultSet rs55=db.statement().executeQuery(" select com_lvls from con_sites where id='"+project+"' ");
           
            int intpass = Integer.parseInt(project);
            if(rs55.next()){
            
               s= procount.unival(intpass,rs55.getInt("com_lvls"));
              jProgressBar1.setValue((int) s);
            }
          
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
    
}
