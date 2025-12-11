package com.test.core.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1Delete {
    public static void main(String[] args) throws SQLException {

        String url="jdbc:mysql://localhost:3306/testdb";
        String uname="testuser";
        String password="OpenText123$";
        Connection conn= DriverManager.getConnection(url,uname,password);

        Statement stmt=conn.createStatement();
        String query="DELETE from users where name='Swapna B'";

        int rowAffected=stmt.executeUpdate(query);
        if(rowAffected!=0){
            System.out.println("Check Db! Data has been deleted");
        }
        else{
            System.out.println("Failed to delete");
        }
        conn.close();
        stmt.close();

    }
}
