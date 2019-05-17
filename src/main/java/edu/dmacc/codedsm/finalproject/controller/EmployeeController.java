package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.model.Employee;

import java.util.List;

public interface EmployeeController {

    public List<Employee> getAll();

    public Employee getEmployee(String empId );

    public void updateEmployee(Employee emp);
}
