package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

public interface PayrollService {
    void processPayroll(EmployeeRepository employees);

    void savePayrollToFile(EmployeeRepository employees);

}

