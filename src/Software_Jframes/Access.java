/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Software_Jframes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Asbar Ali
 */
public class Access {
   
    void ThreadOpen(final JPanel jPanel2, final JLabel jLabel2, final JLabel jLabel1) {
          new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    for (int i = -110; i < 1; i++) {
                        jPanel2.setLocation(i, 0);
                        Thread.sleep(1);
                    }
                    jLabel2.setVisible(false);
                    jLabel1.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();  
    }
  void threadclose(final JLabel jLabel1,final JPanel jPanel2,final JLabel jLabel2,JPanel jPanel4) {
               jLabel1.setVisible(true);
        jPanel2.setVisible(false);
      

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    for (int i = 0; i > -150; i--) {
                        jPanel2.setLocation(i, 0);
                        Thread.sleep(1);
                    }
                    jLabel1.setVisible(false);
                    jLabel2.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        jPanel4.setVisible(false);
    }
   public void setdate(JLabel j) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dd = sdf.format(d);
        
        j.setText(dd);
      
    }

    void settime(final JLabel jLabel14) {
     new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                String ss = sdf.format(d);
                
                jLabel14.setText(ss);

            }
        }).start(); }

  
  

    void setcolor_to_enter(JButton jButton4, JLabel jLabel4) {
       jButton4.setBackground(Color.GRAY);
       jLabel4.setForeground(Color.BLUE); }

    void setnull_exit(JButton jButton4, JLabel jLabel4) {
      jButton4.setBackground(null);
      jLabel4.setForeground(null); }

    void validate_AddProjectCost(String pid, String lvls, String name, String cost,JTextField jTextField1) {
    AddProjectCost ap = new AddProjectCost();
          
        if(pid.equals("--Select--")){
             ap.dispose();
            JOptionPane.showMessageDialog(null, "Please Select the project ID", "Error Message", JOptionPane.ERROR_MESSAGE);
            ap.setVisible(true);
            return;
        }
        if(lvls.equals("") || lvls.equals(null)){
                  ap.dispose();
            JOptionPane.showMessageDialog(null, "Levels are not setted", "Error Message", JOptionPane.ERROR_MESSAGE);
            ap.setVisible(true);
            return;
      
        }
        if (name.equals("") || name.equals(null)) {
            ap.dispose();

            JOptionPane.showMessageDialog(null, "Please enter the name field", "Error Message", JOptionPane.ERROR_MESSAGE);
            ap.setVisible(true);
            return;
        } else if (cost.equals("") || cost.equals(null)) {
            ap.dispose();
            JOptionPane.showMessageDialog(null, "Please enter the cost field", "Error Message", JOptionPane.ERROR_MESSAGE);
            ap.setVisible(true);
            return;

        } else if (!cost.matches("[0-9]+")) {
            ap.dispose();
            JOptionPane.showMessageDialog(null, "Please enter the numbers", "Error", JOptionPane.ERROR_MESSAGE);
            ap.setVisible(true);
            jTextField1.setText("");
            return;
        } }

   public String chooseFile() {
       JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename =f.getAbsolutePath();
        return filename;
    }
    
    void openReport() {
       try {
        String filename = chooseFile();
      
		if ((new File(filename)).exists()) {

			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler "+filename);
			p.waitFor();
				
		} else {

			JOptionPane.showMessageDialog(null,"Error Message","File not exists",JOptionPane.ERROR_MESSAGE);

		}

		System.out.println("Done");

  	  } catch (Exception ex) {
		
	  }
    }

   

   

}
