package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.util.List;

public interface View {
    void render(EmployeeRepository employees);
}
