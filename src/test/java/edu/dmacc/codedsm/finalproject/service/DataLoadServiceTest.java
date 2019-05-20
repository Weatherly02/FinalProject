package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataLoadServiceTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void loadData() {
        EmployeeRepository employeeRespository = new EmployeeRepository();
        DataLoadService dataLoadService = new DataLoadService(employeeRespository);
        Employee employee = dataLoadService.createEmployee("7,Carrie Swetson,23.25");
        assertEquals("Carrie Swetson", employee.getName());
    }

}



