package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataLoadService {
    private EmployeeRepository repository;
    private EmployeeService employeeService;

    public DataLoadService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void loadData() throws IOException {
        employeeService = new EmployeeService(this.repository);

        String filePath = "initial_load.txt";
        String line;
        BufferedReader reader = null;

        reader = new BufferedReader(new FileReader(filePath));

        while (true) {
            if (!((line = reader.readLine()) != null)) break;
            Employee employee = createEmployee(line);
            System.out.println("Employee ID: "+employee.getId()+ " Employee Name: "+employee.getName()+ " Employee Rate: "+employee.getRate() + " Employee Hours Worked: "+employee.getHoursWorked());
            employeeService.save(employee);
        }

        reader.close();
    }

    private Employee createEmployee(String line) {
        Employee employee = new Employee();

        String[] splitEmployeeLine = line.split(",");

        employee.setId(Integer.parseInt(splitEmployeeLine[0]));
        employee.setName(splitEmployeeLine[1]);
        employee.setRate(Double.parseDouble(splitEmployeeLine[2]));
        employee.setHoursWorked(0);

        return employee;
    }
}

