package MailSystem;

import Database.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;



public class EmailFecher {
    
    public String getStaffEmailAddress(String StaffID){
        
        String Email = "";
        
        
        try{
            DBDriver dbd = new DBDriver();
            Statement st = dbd.statementCreated();
            String query = "SELECT * FROM staff_info WHERE StaffID = '"+StaffID+"'";
            System.out.println("Query is : "+query);
            ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                Email  = rs.getString("Email");
                
            } 
        }
        catch(Exception e){
        System.out.println(e);
    }
        return Email;
    }
    
    public String getStaffName(String StaffID){
        
        
        String StaffName = "";
        
        try{
            DBDriver dbd = new DBDriver();
            Statement st = dbd.statementCreated();
            String query = "SELECT * FROM staff_info WHERE StaffID = '"+StaffID+"'";
            System.out.println("Query is : "+query);
            ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                StaffName  = rs.getString("StaffName");
                
            } 
        }
        catch(Exception e){
        System.out.println(e);
    }
        return StaffName;
    }
}
