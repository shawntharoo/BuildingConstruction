/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR;

import test_new.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sandakelum
 */ 
public class db {
 
    public static Connection connect()
    {
    Connection con =null;
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","123");
        
        } catch (Exception e) {
            System.out.println(e);
        }
  
    return con;
    
    } 
}
