package com.test.designPattern.structural.proxy;




public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void getEmployeeInfo(int empID) {
        System.out.println("Fetching employee info for ID: " + empID);
    }

    @Override
    public void createEmployee(Employee obj) {
        System.out.println("Creating employee: " + obj);
    }
}
