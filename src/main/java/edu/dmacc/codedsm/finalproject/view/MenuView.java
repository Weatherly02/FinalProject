package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.controller.EmployeeController;
import edu.dmacc.codedsm.finalproject.controller.EmployeeControllerImpl;
import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class MenuView implements View {

    public void render(EmployeeRepository employees) {
        EmployeeController employeeController = new EmployeeControllerImpl(employees);
        AllEmployeeView allEmployeeView = new AllEmployeeView();
        Boolean isRunning = true;
        Scanner in = new Scanner(System.in);

        while (isRunning) {
            System.out.println("1	List all known employees");
            System.out.println("2	Update an employee's hours ");
            System.out.println("3	Process payroll and exit");
            System.out.println("4	Exit");
            String response = in.next();


            if (response.equals("4")) {
                isRunning = false;
            } else if (response.equals("3")) {
                employeeController.processPayroll();
                isRunning = false;
            } else if (response.equals("2")) {
                //employeeController.updateEmployeeHours();
            } else if (response.equals("1"))
                allEmployeeView.render(employees);
            }
        }
    }
