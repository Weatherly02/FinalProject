package edu.dmacc.codedsm.finalproject;

import edu.dmacc.codedsm.finalproject.controller.DataLoadController;
import edu.dmacc.codedsm.finalproject.controller.EmployeeController;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.view.AllEmployeeView;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository(); // should only have one repository
        DataLoadController dataLoadController = new DataLoadController(repository);
        EmployeeController employeeController = new EmployeeController(repository);
        dataLoadController.load();

        System.out.println(repository);
        System.out.println("data loaded");

        // control flow for entering option to get all, update, do payroll, or exit
        AllEmployeeView view = new AllEmployeeView();
        List<Employee> employees = employeeController.getAllE
        view.render(employees);
    }
}
