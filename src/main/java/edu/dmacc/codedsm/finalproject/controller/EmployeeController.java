package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.util.List;

public class EmployeeController {
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // method to getAll employees calls the employee service
    public List<Employee> getAll() {
        // use service to get all employees
//        return them
    }
}}



