/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Software_Jframes;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jfree.JCommon;

/**
 *
 * @author Asbar Ali
 */
public class validation {
    public boolean isEmpty_text(JTextField jtext,String which){
       boolean bool = false;
        if(jtext.equals("") || jtext.equals(null)){
            JOptionPane.showMessageDialog(null,which +"field is Empty", "Error Message",JOptionPane.ERROR_MESSAGE);
            bool = true;
            return bool;
        }
        return bool;
       
    }
    public void isEmpty_combo(JComboBox jcombo,String which){
       
        if(jcombo.getSelectedItem().toString().equals("") || jcombo.getSelectedItem().toString().equals(null)){
            JOptionPane.showMessageDialog(null,which +"is not selected", "Error Message",JOptionPane.ERROR_MESSAGE);
            return;
    }
}
}
