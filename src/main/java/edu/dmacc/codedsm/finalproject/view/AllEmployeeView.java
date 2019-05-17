package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

public class AllEmployeeView implements View {
    public AllEmployeeView() {
    }

    public void render(EmployeeRepository employees) {
        employees.getAllEmployees().forEach(employee -> System.out.println(employee));

    }
}