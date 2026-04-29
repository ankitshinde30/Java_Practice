package jdbc;

import java.sql.*;
import java.util.*;

public class StudentDAO {

    int id, age;
    String name, email, city;

    Scanner sc = new Scanner(System.in);

    // INSERT RECORD
    public void InsertRecord() throws Exception {

        System.out.println("Enter Student Id");
        id = sc.nextInt();

        System.out.println("Enter Student Name");
        name = sc.next();

        System.out.println("Enter Student Email");
        email = sc.next();

        System.out.println("Enter Student age");
        age = sc.nextInt();

        System.out.println("Enter Student City");
        city = sc.next();

        // Get connection
        Connection conn = DBUtil.getConnection();

        // SQL Insert Query
        PreparedStatement ps = conn.prepareStatement(
            "insert into student values(?,?,?,?,?)"
        );

        // Set values in query
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, email);
        ps.setInt(4, age);
        ps.setString(5, city);

        // Execute query
        int result = ps.executeUpdate();

        if (result > 0) {
            System.out.println("Record Inserted Successfully");
        } else {
            System.out.println("Error Occurred while Inserting record");
        }

        conn.close();
    }

    // UPDATE RECORD
    public void UpdateRecord() throws Exception {

        System.out.println("Enter Student Id");
        id = sc.nextInt();

        System.out.println("Enter Student Name");
        name = sc.next();

        System.out.println("Enter Student Email");
        email = sc.next();

        System.out.println("Enter Student age");
        age = sc.nextInt();

        System.out.println("Enter Student City");
        city = sc.next();

        Connection conn = DBUtil.getConnection();

        // Correct SQL Query
        PreparedStatement ps = conn.prepareStatement(
            "update student set sname=?, age=?, email=?, city=? where id=?"
        );

        // Set values correctly
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.setString(3, email);
        ps.setString(4, city);
        ps.setInt(5, id);

        int result = ps.executeUpdate();

        if (result > 0) {
            System.out.println("Record Updated Successfully");
        } else {
            System.out.println("Error Occurred while Updating record");
        }

        conn.close();
    }

    // DELETE RECORD
    public void deleteRecord() throws Exception {

        System.out.println("Enter Student Id");
        id = sc.nextInt();

        Connection conn = DBUtil.getConnection();

        PreparedStatement ps = conn.prepareStatement(
            "delete from student where id=?"
        );

        ps.setInt(1, id);

        int result = ps.executeUpdate();

        if (result > 0) {
            System.out.println("Record Deleted Successfully");
        } else {
            System.out.println("Error Occurred while Deleting record");
        }

        conn.close();
    }

    // VIEW RECORDS
    public void viewRecord() throws Exception {

        Connection conn = DBUtil.getConnection();

        Statement stat = conn.createStatement();

        ResultSet rs = stat.executeQuery("select * from student");

        // Loop through results
        while (rs.next()) {
            System.out.println(
                rs.getInt(1) + "\t " + rs.getString(2)
            );
        }

        conn.close();
    }

    // LOGIN METHOD
    public boolean login(String username, String password) throws Exception {

        Connection con = DBUtil.getConnection();

        String sql = "select * from logins where username=? and password=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        // If record exists → login success
        boolean status = rs.next();

        con.close();

        return status;
    }
}