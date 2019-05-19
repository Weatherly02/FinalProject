package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.service.EmployeeService;
import edu.dmacc.codedsm.finalproject.view.allEmployeeView;

import java.util.List;

public class EmployeeControllerImpl implements EmployeeController {
        EmployeeService employeeService;

    public EmployeeControllerImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public allEmployeeView getAll() {
        allEmployeeView allEmployeeView = new allEmployeeView();
        List<Employee> allEmployees = employeeService.getAll();
        allEmployeeView.setEmployees(allEmployees);
        return allEmployeeView;
    }

    @Override
    public Employee getEmployee(String empId) {
        return employeeService.getById(empId);
    }

    @Override
    public void updateEmployee(Employee emp) {
        employeeService.getById(emp.getId().toString()).setHoursWorked(emp.getHoursWorked());
    }
}




