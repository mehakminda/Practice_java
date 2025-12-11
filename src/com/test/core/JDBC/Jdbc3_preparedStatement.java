package com.test.core.JDBC;

import java.sql.*;

/**
 * Prepared statement / Parameterized query-> non-hardcoded sql query  (custom queries)
 * Prepared statement is a child interface of statement
 */
public class Jdbc3_preparedStatement {
    public static void main(String[] args) throws SQLException {

        String url="jdbc:mysql://localhost:3306/testdb";
        String uname="testuser";
        String password="OpenText123$";
        Connection conn= DriverManager.getConnection(url, uname, password);
        String query="";
        PreparedStatement pstmt=conn.prepareStatement(query);
        
    }
}
