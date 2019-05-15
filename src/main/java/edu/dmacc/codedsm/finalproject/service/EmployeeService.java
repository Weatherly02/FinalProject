package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void save(Employee employee) {
        this.employeeRepository.save(employee);
    }


    // get employee by Id

    // get all employees - asks employee repository for all

    public List<Employee> getAllEmployees() {
        return this.employeeRepository.getAllEmployees();
    }



    //void update(List<Employee> employeeList, Integer id, Integer hours);
    //void processPayroll(List<Employee> employeeList);
}
