import java.sql.*;
import java.util.Scanner;

public class InsertStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/school", "root", "your_password");

            // Create statement
            Statement stmt = con.createStatement();

            // Insert query
            String query = "INSERT INTO students VALUES (" + roll + ", '" + name + "', " + marks + ")";
            int result = stmt.executeUpdate(query);

            if (result > 0)
                System.out.println("Student record inserted successfully!");
            else
                System.out.println("Insert failed.");

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

