package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.util.List;

public class AllEmployeeView implements View {

    private List<Employee> employees;

    public AllEmployeeView() {
    }

    public void render() {
        employees.forEach(employee -> System.out.println(employee));

    }

    public void setEmployees(List<Employee> allEmployees) {
        employees = allEmployees;
    }
}