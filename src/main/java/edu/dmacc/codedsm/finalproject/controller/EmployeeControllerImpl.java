package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.EmployeeService;

import java.util.List;

public class EmployeeControllerImpl implements EmployeeController {
    private EmployeeRepository employeeRepository;
    EmployeeService employeeService = new EmployeeService(employeeRepository);

    public EmployeeControllerImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public Employee getEmployee(String empId) {
        return employeeRepository.getEmployeeById(empId);
    }

    @Override
    public void updateEmployee(Employee emp) {
        //employeeRepository.getEmployeeById(emp.getId().toString()).setHoursWorked(emp.getHoursWorked());
        employeeRepository.getEmployeeById(emp.getId().toString()).setHoursWorked(emp.getHoursWorked());
    }
}




