package StaffOperations;

import Database.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StaffDBOP {
    public static boolean isStaff_infoCreated() {
    boolean flag = false;

    try {
        DBDriver dbd = new DBDriver();
        Statement st = dbd.statementCreated();

        String query = "CREATE TABLE IF NOT EXISTS staff_info (" +
                "StaffName VARCHAR(50), " +
                "MobileNumber VARCHAR(50), " +
                "Email VARCHAR(50), " +
                "StaffID VARCHAR(50), " +
                "Password VARCHAR(50), " +
                "DateAndtime VARCHAR(50))";

        st.executeUpdate(query);   // No condition check
        flag = true;

        st.close();
    }
    catch (Exception e) {
        System.out.println("Exception at isStaff_infoCreated() in StaffDBOP : " + e);
        flag = false;
    }

    return flag;
}

    
    
    
    
    public static boolean isStaffinfoCreated(String name,String mobileno,String email,String StaffID,String password, String date_time)
    {
        boolean flag = true;
        try{
        DBDriver dbd =new DBDriver();
        Statement st = dbd.statementCreated();

        String query = "insert into staff_info values ('"+name+"', '"+mobileno+"', '"+email+"','"+StaffID+"','"+password+"', '"+date_time+"')";
        if(st.executeUpdate(query) > 0)
            flag = true;
         }
        catch(Exception e)
        {
            System.out.println("Exception at isStaffinfoCreated() in StaffDBOP : "+ e);
            flag = false;
        }
        return flag;
    }
    
    
    public static boolean isStaffinfoExisted(String StaffID, String Password)
    {
        boolean flag = false;
        try
        {
          DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
          String query = "select * from staff_info where StaffID = '"+StaffID+"' and Password = '"+Password+"'";
          ResultSet rs = st.executeQuery(query);
          if(rs.next())
              flag = true;
        }
        catch(Exception e)
        {
            System.out.println("Exception at isStaffinfoExisted() in StaffDBOP class: "+ e);
            flag = false;
        }
        return flag;
    }
    
    
    
    
    
    
    public static boolean isStaffUpdated(String name, String mobileno,String email,String StaffID,String password, String date_time)
    {
        boolean flag = false;
        try{
        DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
          
       
        String query = "update staff_info set StaffName = '"+name+"',MobileNumber = '"+mobileno+"',Email= '"+email+"',Password = '"+password+"',DateAndtime = '"+date_time+"' where StaffID = '"+StaffID+"' ";
        if(st.executeUpdate(query) > 0)
         flag = true;
         }
        catch(Exception e)
        {
            System.out.println("Exception at isStaffUpdated() in StaffDBOP: "+ e);
            flag = false;
        }
        return flag;  
    }
    
    
    
    
    
    
    
    public static ArrayList getStaffData(String StaffID)
    {
        ArrayList temp = new ArrayList();
     try
        {
            DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
          String query = "select * from staff_info where StaffID = '"+StaffID+"'";
          ResultSet rs = st.executeQuery(query);
          while(rs.next())
          {
              
              temp.add(rs.getString(1));
              temp.add(rs.getString(2));
              temp.add(rs.getString(3));
              temp.add(rs.getString(4));
              temp.add(rs.getString(5));
              
          }
        }
        catch(Exception e)
        {
            System.out.println("Exception at getSStaffData() in StaffDBOP class: "+ e); 
        }   
     return temp;
    
    }
    
    
    
        public static int getRowCount(){
        
        int rowCount = 0;

        try {
          DBDriver dbd =new DBDriver();
          Statement stmt = dbd.statementCreated();

            String query = "SELECT COUNT(*) FROM staff_info";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
            rowCount = rs.getInt(1); // get count value
            }

            System.out.println("Total rows: " + rowCount);

            rs.close();
            stmt.close();
            

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return rowCount;

    }
         public static boolean isCanceled(String StaffID)
    {
        boolean flag = false;
        try{
        DBDriver dbd =new DBDriver();
        Statement st = dbd.statementCreated();
          
        String query = "DELETE FROM staff_info WHERE ERP = '"+StaffID+"' ";

                
        if(st.executeUpdate(query) > 0)
         flag = true;
         }
        catch(Exception e)
        {
            System.out.println("Exception at isCanceled() in StaffDBOP: "+ e);
            flag = false;
        }
        return flag;  
    }
    
}
         

