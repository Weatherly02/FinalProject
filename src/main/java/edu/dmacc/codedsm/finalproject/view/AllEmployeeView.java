package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.Employee;

import java.util.List;

public class AllEmployeeView {
    public AllEmployeeView() {}

    public void render(List<Employee> employees) {
        for (Employee ee : employees) {
            System.out.println(ee);
        }
    }
}
