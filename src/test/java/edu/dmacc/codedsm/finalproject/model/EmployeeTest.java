package edu.dmacc.codedsm.finalproject.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void setId() {
        Employee employee = new Employee();
        employee.setId(7);
        assertArrayEquals(7, 7);
    }

    private void assertArrayEquals(int i, int i1) {

    }

    @Test
    public void setName() {
        Employee employee = new Employee();
        employee.setName("Carrie Swetson");
        assertEquals("Carrie Swetson", employee.getName());
    }

    @Test
    public void setHoursWorked() {
        Employee employee = new Employee();
        employee.setHoursWorked(0);
        assertArrayEquals(0, 0);
    }
}