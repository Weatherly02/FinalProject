package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;


    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void save(Employee employee) {
        this.employeeRepository.save(employee);
    }

    public List<Employee> getAll() {
        return this.employeeRepository.getAll();
    }

    @Override
    public Employee getById(String empId) {
        return employeeRepository.getById(empId);
    }

}
