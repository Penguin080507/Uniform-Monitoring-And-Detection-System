
package StudentOperation;

import Database.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class StudentDBOP {
    public static boolean isStudent_infoCreated() {
    boolean flag = false;

    try {
        DBDriver dbd = new DBDriver();
        Statement st = dbd.statementCreated();

        String query = "CREATE TABLE IF NOT EXISTS student_info (" +
                "ERP VARCHAR(50), " +
                "StudentName VARCHAR(50), " +
                "StudentMobileNumber VARCHAR(50), " +
                "StudentEmail VARCHAR(50), " +
                "ParentName VARCHAR(50), " +
                "ParentMobileNumber VARCHAR(50), " +
                "ParentEmail VARCHAR(50), " +
                "parentAC VARCHAR(50), " +
                "Bank VARCHAR(50), " +
                "Photo VARCHAR(50), " +      // ✅ Added comma
                "admission_date VARCHAR(50)" +      // ✅ Better name & type
                ")";

        st.executeUpdate(query);
        flag = true;

        st.close();

    } catch (Exception e) {
        System.out.println("Exception at isStudent_infoCreated(): " + e);
        flag = false;
    }

    return flag;
}

    
    
    
    public static boolean isStudentinfoCreated(String ERP, String studentname,String studentmobileno,String studentemail,String Parentname, String Parentmobile,String Parentemail, String ParentAC,String bank, String photo,String Date_)
    {
        boolean flag = true;
        try{
        DBDriver dbd =new DBDriver();
        Statement st = dbd.statementCreated();

        String query = "insert into student_info values ('"+ERP+"','"+studentname+"', '"+studentmobileno+"', '"+studentemail+"','"+Parentname+"','"+Parentmobile+"','"+Parentemail+"','"+ParentAC+"','"+bank+"', '"+photo+"','"+Date_+"')";
        if(st.executeUpdate(query) > 0)
            flag = true;
         }
        catch(Exception e)
        {
            System.out.println("Exception at isStudentinfoCreated() in StudentDBOP : "+ e);
            flag = false;
        }
        return flag;
    }
    
    
    public static boolean isStudentinfoExisted(String ERP)
    {
        boolean flag = false;
        try
        {
          DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
          String query = "select * from student_info where ERP = '"+ERP+"'";
          ResultSet rs = st.executeQuery(query);
          if(rs.next())
              flag = true;
        }
        catch(Exception e)
        {
            System.out.println("Exception at isStudentinfoExisted() in StudentDBOP class: "+ e);
            flag = false;
        }
        return flag;
    }
    
    
    
    
    
    public static boolean isStudentUpdated(String ERP, String studentname,String studentmobileno,String studentemail,String Parentname, String Parentmobile,String Parentemail, String ParentAC,String bank, String photo)
    {
        boolean flag = false;
        try{
        DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
          
       
        String query = "update student_info set StudentName = '"+studentname+"',StudentMobileNumber = '"+studentmobileno+"',StudentEmail= '"+studentemail+"',ParentName = '"+Parentname+"',ParentMobileNumber = '"+Parentmobile+"',ParentEmail = '"+Parentemail+"',parentAC = '"+ParentAC+"',Bank = '"+bank+"',Photo = '"+photo+"' where ERP = '"+ERP+"' ";
        if(st.executeUpdate(query) > 0)
         flag = true;
         }
        catch(Exception e)
        {
            System.out.println("Exception at isStudentUpdated() in StudentDBOP: "+ e);
            flag = false;
        }
        return flag;  
    }
    
    
    
    
    
    public static ArrayList getStudentData(String ERP)
    {
        ArrayList temp = new ArrayList();
     try
        {
            DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
          String query = "select * from student_info where ERP = '"+ERP+"'";
          ResultSet rs = st.executeQuery(query);
          while(rs.next())
          {
              
              temp.add(rs.getString(1));
              temp.add(rs.getString(2));
              temp.add(rs.getString(3));
              temp.add(rs.getString(4));
              temp.add(rs.getString(5));
              temp.add(rs.getString(6));
              temp.add(rs.getString(7));
              temp.add(rs.getString(8));
              temp.add(rs.getString(9));
              temp.add(rs.getString(10));
              
          }
        }
        catch(Exception e)
        {
            System.out.println("Exception at getStudentData() in StudentDBOP class: "+ e); 
        }   
     return temp;
    
    }
    
    
    
    
    
    
    
    public static boolean isCanceled(String ERP)
    {
        boolean flag = false;
        try{
        DBDriver dbd =new DBDriver();
        Statement st = dbd.statementCreated();
          
        String query = "DELETE FROM student_info WHERE ERP = '"+ERP+"' ";

                
        if(st.executeUpdate(query) > 0)
         flag = true;
         }
        catch(Exception e)
        {
            System.out.println("Exception at isCanceled() in StudentDBOP: "+ e);
            flag = false;
        }
        return flag;  
    }
    
    
    public static int getRowCount(){
        
        int rowCount = 0;

        try {
          DBDriver dbd =new DBDriver();
          Statement stmt = dbd.statementCreated();

            String query = "SELECT COUNT(*) FROM student_info";
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
    
    
    
    
    public static boolean bank_account_info() {
    boolean flag = false;

    try {
        DBDriver dbd = new DBDriver();
        Statement st = dbd.statementCreated();

        String query = "CREATE TABLE IF NOT EXISTS bank_account_info (" +
                "parent_name VARCHAR(50), " +
                "parentAC VARCHAR(50) PRIMARY KEY, " +
                "bank_balance VARCHAR(50)" +
                ")";

        st.executeUpdate(query);
        flag = true;

        st.close();

    } catch (Exception e) {
        System.out.println("Exception at bank_account_info(): " + e);
        flag = false;
    }

    return flag;
  }
    
    
    public static boolean isbank_account_infoCreated(String Parentname, String ParentAC,String bankbalance)
    {
        boolean flag = true;
        try{
        DBDriver dbd =new DBDriver();
        Statement st = dbd.statementCreated();

        String query = "insert into bank_account_info values ('"+Parentname+"','"+ParentAC+"','"+bankbalance+"')";
        if(st.executeUpdate(query) > 0)
            flag = true;
         }
        catch(Exception e)
        {
            System.out.println("Exception at isbank_account_infoCreated() in StudentDBOP : "+ e);
            flag = false;
        }
        return flag;
    }

}
