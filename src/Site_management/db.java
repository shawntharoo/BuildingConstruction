/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Site_management;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AKLive
 */
public class db {
      public static Connection getconnection() throws Exception{
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","123");
        return c;
    }
    
}
