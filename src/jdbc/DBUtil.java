package jdbc;

import java.sql.*;

//Utility class to handle database connection
public class DBUtil {
 public static Connection getConnection() throws Exception {
     // Load MySQL JDBC Driver
     Class.forName("com.mysql.cj.jdbc.Driver");
     
     // Establish connection to database
     return DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/itvedant",
         "root",
         "Shinde@123"
     );
 }
}