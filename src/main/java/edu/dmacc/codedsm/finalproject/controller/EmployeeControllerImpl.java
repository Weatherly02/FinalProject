package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.EmployeeService;

import java.util.List;

public class EmployeeControllerImpl implements EmployeeController{
    private EmployeeRepository employeeRepository;
EmployeeService employeeService = new EmployeeService(employeeRepository);
    public void processPayroll(){
       // for
        //employeeService.computeHours
        
    }
            
    public EmployeeControllerImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // method to getAll employees calls the employee service
     public List<Employee> getAll() {
         return employeeRepository.getAllEmployees();
     }
    }





