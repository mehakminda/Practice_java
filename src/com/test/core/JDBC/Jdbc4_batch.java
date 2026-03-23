package com.test.core.JDBC;

// add/updating/deleting multiple rows in a single shot is called batch

import java.sql.*;
import java.util.Arrays;

public class Jdbc4_batch {
    static PreparedStatement stmt=null;
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/testdb";
        String uname="testuser";
        String password="OpenText123$";
        Connection conn= DriverManager.getConnection(url,uname,password);



        //adding data
/*

         String query="INSERT INTO users (name,email) VALUES (?,?)";
        stmt = conn.prepareStatement(query);

        stmt.setString(1,"Renu");
        stmt.setString(2,"mindarenu@gmail.com");
        stmt.addBatch();

        stmt.setString(1,"Manish");
        stmt.setString(2,"mindamanish@gmail.com");
        stmt.addBatch();

        int[] rowsAffected = stmt.executeBatch();
        System.out.println("rows added are " + Arrays.toString(rowsAffected));
*/


        //updating data

        String query2="update users set name = ? where name = ? ";
        stmt = conn.prepareStatement(query2);

        stmt.setString(1,"Renu Minda");
        stmt.setString(2,"Renu");
        stmt.addBatch();

        stmt.setString(1,"Manish Minda");
        stmt.setString(2,"Manish");
        stmt.addBatch();

        int[] rowsAffected2 = stmt.executeBatch();
        System.out.println("rows updated are " + Arrays.toString(rowsAffected2));


        //deleting data
/*
        String query3="delete from users where name= ?";
        stmt = conn.prepareStatement(query2);

        stmt.setString(1,"Renu");
        stmt.addBatch();
        stmt.setString(1,"Manish");
        stmt.addBatch();

        int[] rowsAffected3 = stmt.executeBatch();
        System.out.println("rows deleted are " + Arrays.toString(rowsAffected3));
        */


        //return type is interesting, for each batch , the number of rows affected is shown in the ith posiiton of the array


    }
}
