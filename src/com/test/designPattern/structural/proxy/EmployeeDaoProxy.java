package com.test.designPattern.structural.proxy;



public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDaoImpl employeeDaoimp;
    private String clientRole;

    public EmployeeDaoProxy( String clientRole) {
        this.employeeDaoimp = new EmployeeDaoImpl();
        this.clientRole = clientRole;
    }

    @Override
    public void getEmployeeInfo(int empID) throws RuntimeException{
        if(clientRole.equals("ADMIN") || clientRole.equals("USER"))
            employeeDaoimp.getEmployeeInfo(empID);
        else{
            throw new RuntimeException("Access Denied");
        }
    }

    @Override
    public void createEmployee(Employee obj) throws RuntimeException{
        if (clientRole.equals("ADMIN")) {
            employeeDaoimp.createEmployee(obj);
        } else {
            throw new RuntimeException("Access Denied");
        }

    }
}
