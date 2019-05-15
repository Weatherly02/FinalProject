package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.DataLoadService;

import java.io.IOException;

public class DataLoadController {
    private DataLoadService dataLoadService;
    private EmployeeRepository repository;

    public void load() {
        dataLoadService = new DataLoadService(repository);

        try {
            dataLoadService.loadData();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("data load failed");
            System.exit(1);
        }
    }

    public DataLoadController(EmployeeRepository repository) {
        this.repository = repository;
    }
}
