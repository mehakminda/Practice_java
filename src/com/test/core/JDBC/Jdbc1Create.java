package com.test.core.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1Create {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/testdb";
        String uname="testuser";
        String password="OpenText123$";

        Connection conn = DriverManager.getConnection(url, uname, password);

        Statement stmt= conn.createStatement();

        String query="INSERT INTO users (name,email) VALUES ('Swapna','bswapna@opentext.com')";
        int rowsAffected =stmt.executeUpdate(query);

        if(rowsAffected!=0){
            System.out.println("Check Db! Data has been added");
        }
        else {
            System.out.println("Failed to add");
        }
        stmt.close();
        conn.close();
    }
}
