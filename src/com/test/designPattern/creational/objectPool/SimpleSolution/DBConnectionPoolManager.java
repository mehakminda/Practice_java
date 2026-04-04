package com.test.designPattern.creational.objectPool.SimpleSolution;

import com.test.designPattern.creational.objectPool.resource.DBConnection;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    List<DBConnection> freeConnections = new ArrayList<>();
    List<DBConnection> inUseConnection = new ArrayList<>();
    final int INITIAL_POOL_SIZE = 3;
    final int MAX_POOL_SIZE= 6;

    public DBConnectionPoolManager() {
        for(int i = 0 ; i < INITIAL_POOL_SIZE ; i++){
            freeConnections.add(new DBConnection());
        }
    }
    public DBConnection getDBConnection(){
        DBConnection dbConnection = null;
        if(freeConnections.isEmpty() && inUseConnection.size()< MAX_POOL_SIZE){
            freeConnections.add(new DBConnection());
            System.out.println("New DBConnection created and added to freeConnections list.");
            System.out.println("freeConnections size: " + freeConnections.size());
            System.out.println("inUseConnections size: " + inUseConnection.size());
        }
        else if(freeConnections.isEmpty() && inUseConnection.size() >= MAX_POOL_SIZE){
            System.out.println("Pool is full. Cannot create new DBConnection.");
            return null;
        }
        dbConnection = freeConnections.remove(freeConnections.size()-1);
        inUseConnection.add(dbConnection);
        System.out.println("DBConnection retrieved from freeConnections list and added to inUseConnections list.");
        System.out.println("freeConnections size: " + freeConnections.size());
        System.out.println("inUseConnections size: " + inUseConnection.size());
        return dbConnection;

    }

    public void releaseDBConnection(DBConnection dbConnection){
        if(dbConnection != null){
            inUseConnection.remove(dbConnection);
            freeConnections.add(dbConnection);
            System.out.println("DBConnection released from inUseConnections list and added to freeConnections list.");
            System.out.println("freeConnections size: " + freeConnections.size());
            System.out.println("inUseConnections size: " + inUseConnection.size());

        }
        else {
            System.out.println("DBConnection is null. Cannot release.");
        }

    }
}
