package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.service.PayrollService;
import edu.dmacc.codedsm.finalproject.service.PayrollServiceImpl;

public class PayrollControllerImpl implements PayrollController {
    PayrollService payrollService = new PayrollServiceImpl();

    @Override
    public void processPayroll() {

        //adding payroll service method calls  from PayrollService



    }
}
