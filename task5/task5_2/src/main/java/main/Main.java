package main;

import controller.GenerateController;
import model.GenerateModel;
import model.GenerateRepository;
import view.GenerateView;

public class Main {

    public static void main(String[] args){
        GenerateRepository repository = new GenerateRepository();
        GenerateModel model = new GenerateModel(repository);
        GenerateView view = new GenerateView();
        GenerateController controller = new GenerateController(model,view);

        controller.run();
    }
}
