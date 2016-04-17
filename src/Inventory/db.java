/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import test_new.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author demo
 */
public class db {
      public static Connection getconnection() throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","123");
        return c;
    }
    
}
