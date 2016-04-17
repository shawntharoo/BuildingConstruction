/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package subcontractor;

import test_new.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author westlifzzz
 */
public class db {
    public static Connection getConnection() throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver");
                Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","123");
                return c;
        
    }

    static Object getconnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
