package StudentOperation;

import Database.DBDriver;
import java.sql.*;
import org.jfree.data.category.DefaultCategoryDataset;

public class StudentData {

    public static DefaultCategoryDataset getDataset() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            // Create DB connection and statement
            DBDriver dbd = new DBDriver();
            Statement st = dbd.statementCreated();

            // Query: count students per day
            // Since admission_date is stored as VARCHAR in format dd-MM-yyyy,
            // we group by the string directly
            String query = "SELECT admission_date, COUNT(*) AS total " +
                           "FROM student_info " +
                           "WHERE admission_date IS NOT NULL AND admission_date <> '' " +
                           "GROUP BY admission_date " +
                           "ORDER BY STR_TO_DATE(admission_date, '%d-%m-%Y')";

            ResultSet rs = st.executeQuery(query);

            boolean hasData = false;

            while (rs.next()) {
                String dateStr = rs.getString("admission_date"); // Get string directly
                int total = rs.getInt("total");

                if (dateStr != null && !dateStr.isEmpty()) {
                    dataset.addValue(total, "Students", dateStr);
                    System.out.println("Date: " + dateStr + " Total: " + total);
                    hasData = true;
                }
            }

            // If no data, show placeholder
            if (!hasData) {
                dataset.addValue(0, "Students", "No Data");
            }

            // Close resources
            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dataset;
    }
    
}
