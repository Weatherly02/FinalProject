package edu.dmacc.codedsm.finalproject;

import edu.dmacc.codedsm.finalproject.controller.DataLoadController;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.view.MenuView;

public class Runner {
    public static void main(String[] args) {

        EmployeeRepository repository = new EmployeeRepository(); // should only have one repository
        DataLoadController dataLoadController = new DataLoadController(repository);
        dataLoadController.load();

        System.out.println(repository);

        MenuView view = new MenuView();
        view.render(repository);

    }
}
