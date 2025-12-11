package com.test.core.JDBC;

import java.sql.*;

/**
 * using execute method to make sql queries
 * this execute method returns boolean value
 */
public class Jdbc2 {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/testdb";
        String uname="testuser";
        String password="OpenText123$";
        Connection conn=DriverManager.getConnection(url, uname, password);
        Statement stmt=conn.createStatement();

        //String query="Update users set name='Mehak Minda' where name='Mehak'";
        String query="select * from users";
        boolean status=stmt.execute(query);
        if(status){
            //ResultSet
            System.out.println("Write ResultSet implementation to get data");
            ResultSet rs=stmt.getResultSet();
            if(rs!=null){
                System.out.println("ID\tName\tEmail\n");
                while(rs.next()){
                    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));

                }
                rs.close();
            }
        }
        else{
            System.out.println("get the update of how many rows affected");
            int rowsAffected=stmt.getUpdateCount();
            System.out.println(rowsAffected);

        }
        conn.close();
        stmt.close();
    }
}
