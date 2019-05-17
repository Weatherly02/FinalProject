package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;

import java.util.List;

public interface EmployeeService {
    void save(Employee employee);
    List<Employee> getAll();

    Employee getById(String empId);
}
