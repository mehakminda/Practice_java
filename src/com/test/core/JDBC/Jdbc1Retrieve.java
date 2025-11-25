package com.test.core.JDBC;

import java.sql.*;

/**
 * Demostrates a simple JDBC connection to MySQL database and fetches data from a table
 */


public class Jdbc1Retrieve {
    public static void main(String[] args) throws SQLException {
        System.out.println("JDBC Example");
        String url="jdbc:mysql://127.0.0.1:3306/testdb";
        String uname="testuser";
        String password="OpenText123$";

        Connection connect= DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Successful: "+connect.toString());

        Statement stmt=connect.createStatement();
        System.out.println("Statement created: "+stmt.toString());

        String query="Select * from users";
        ResultSet rs=stmt.executeQuery(query);
        System.out.println("We got results from the table: ");
        System.out.print("ID\tName\tEmail\n");

        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }
        connect.close();
        stmt.close();
        rs.close();
    }
}
