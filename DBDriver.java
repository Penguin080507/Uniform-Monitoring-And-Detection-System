/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author hp
 */
public class DBDriver {
    public Connection conn = null;
    public Statement st=null;
    public  Statement statementCreated()
    {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uniform", "root", "root");
            st = conn.createStatement();
        }
        catch(Exception e)
        {
            System.out.println("Exception at statementCreated() in class DBDriver: "+ e);  
        }
      return st;
    }
}
