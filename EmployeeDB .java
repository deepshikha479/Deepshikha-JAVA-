package Deepshikhajdbc;

import java.sql.*;

public class EmployeeDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/alishadb";  // Database name
        String user = "root";                                 // Your DB username
        String password = "";                                 // Your DB password

        String[][] employees = {
            {"101", "John", "50000", "Sales"},
            {"102", "Alisa", "60000", "HR"},
            {"103", "Bibek", "55000", "Sales"},
            {"104", "Dipesh", "70000", "IT"},
            {"105", "Sangam", "52000", "Sales"},
        };

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection con = DriverManager.getConnection(url, user, password);

            // Insert employee records
            String insertSQL = "INSERT INTO employee (eid, ename, salary, department) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(insertSQL);

            for (String[] emp : employees) {
                pst.setInt(1, Integer.parseInt(emp[0]));
                pst.setString(2, emp[1]);
                pst.setDouble(3, Double.parseDouble(emp[2]));
                pst.setString(4, emp[3]);
                pst.executeUpdate();
            }

            // Display employees in Sales department
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employee WHERE department = 'Sales'");

            System.out.println("EID\tEname\tSalary\tDepartment");
            while (rs.next()) {
                System.out.println(rs.getInt("eid") + "\t" +
                                   rs.getString("ename") + "\t" +
                                   rs.getDouble("salary") + "\t" +
                                   rs.getString("department"));
            }

            // Close resources
            rs.close();
            st.close();
            pst.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error:");
            e.printStackTrace();
        }
    }
}

