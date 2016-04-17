/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Software_Jframes;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Asbar Ali
 */
public class db {
    public static Statement statement() throws Exception{
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","123");
        Statement st= c.createStatement();
        return st;
    }
    
}
