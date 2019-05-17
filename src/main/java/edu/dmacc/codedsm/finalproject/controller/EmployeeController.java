package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.view.AllEmployeeView;

public interface EmployeeController {

    public AllEmployeeView getAll();

    public Employee getEmployee(String empId );

    public void updateEmployee(Employee emp);

}
