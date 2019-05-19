package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.model.Employee;

import java.util.List;

public class allEmployeeView implements View {

    private List<Employee> employees;

    public allEmployeeView() {
    }

    public void render() {
        employees.forEach(employee -> System.out.println(employee));

    }

    public void setEmployees(List<Employee> allEmployees) {
        employees = allEmployees;
    }
}