package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PayrollServiceImpl implements PayrollService {
    public PayrollServiceImpl() {

    }

    @Override
    public void processPayroll(EmployeeRepository employees) {
        employees.getAllEmployees().forEach(employee -> System.out.println("For employee " + employee.getId() + ", payroll = " + employee.getRate() * employee.getHoursWorked() / 1.2));
    }

    @Override
    public void savePayrollToFile(EmployeeRepository employees) {
        File file = new File("payroll_results.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            PrintWriter pw = new PrintWriter("payroll_results.txt");
            employees.getAllEmployees().forEach(employee -> pw.println(employee));
            pw.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

    }

}
