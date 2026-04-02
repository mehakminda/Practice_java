package com.test.designPattern.structural.proxy;

public class EmployeeManagement {
    static void main(String args[]) {
        System.out.println("===== Proxy Design Pattern =====");
        try{
            EmployeeDaoProxy usrProxyObj = new EmployeeDaoProxy("USER");
            usrProxyObj.getEmployeeInfo(1); //access granted
            usrProxyObj.createEmployee(new Employee()); //access denied
        }
        catch(RuntimeException e){
            //handling the exception
            System.out.println(e.getMessage());
        }


    }
}
