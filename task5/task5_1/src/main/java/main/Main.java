package main;

import controller.JournalController;
import model.JournalModel;
import model.JournalRepository;
import view.JournalView;

public class Main {
    public static void main(String[] args){

        JournalRepository repository = new JournalRepository();
        JournalModel model = new JournalModel(repository);
        JournalView view = new JournalView();

        JournalController controller = new JournalController(model,view);
        controller.run();

    }
}
