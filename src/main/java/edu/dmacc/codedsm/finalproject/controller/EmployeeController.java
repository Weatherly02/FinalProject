package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.view.allEmployeeView;

public interface EmployeeController {

    public allEmployeeView getAll();

    public Employee getEmployee(String empId );

    public void updateEmployee(Employee emp);

}
