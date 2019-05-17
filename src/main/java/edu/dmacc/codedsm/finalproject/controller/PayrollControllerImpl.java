package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.PayrollService;
import edu.dmacc.codedsm.finalproject.service.PayrollServiceImpl;

public class PayrollControllerImpl implements PayrollController {
    PayrollService payrollService = new PayrollServiceImpl();

    @Override
    public void processPayroll(EmployeeRepository employees) {
        payrollService.processPayroll(employees);
        savePayrollToFile(employees);
    }

    private void savePayrollToFile(EmployeeRepository employees) {
        payrollService.savePayrollToFile(employees);
    }
};

