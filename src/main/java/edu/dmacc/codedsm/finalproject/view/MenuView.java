package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.controller.EmployeeController;
import edu.dmacc.codedsm.finalproject.controller.EmployeeControllerImpl;
import edu.dmacc.codedsm.finalproject.controller.PayrollController;
import edu.dmacc.codedsm.finalproject.controller.PayrollControllerImpl;
import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.util.Scanner;

public class MenuView implements View {

    public void render(EmployeeRepository employees) {
        EmployeeController employeeController = new EmployeeControllerImpl(employees);
        PayrollController payrollController = new PayrollControllerImpl();
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
                payrollController.processPayroll(employees);
                payrollController.savePayrollToFile(employees);
                isRunning = false;
            } else if (response.equals("2")) {
                System.out.print("Employee ID: ");
                String empId = in.next();
                Employee e = employeeController.getEmployee(empId);
                System.out.println("");
                if (e == null) {
                    System.out.println("Employee not found");
                } else {
                    System.out.print("Employee hours: ");
                    String empHours = in.next();
                    e.setHoursWorked(Integer.parseInt(empHours));
                    employeeController.updateEmployee(e);
                    System.out.println("");
                }
            } else if (response.equals("1"))
                allEmployeeView.render(employees);
        }
    }
}


