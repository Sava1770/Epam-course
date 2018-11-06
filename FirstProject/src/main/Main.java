package main;

import controller.BankController;
import model.BankModel;
import model.BankRepository;
import view.BankView;

public class Main {

    public static void main(String[] args){
        BankRepository repository = new BankRepository();
        BankModel model = new BankModel(repository);
        BankView view = new BankView();
        BankController controller = new BankController(view,model);

        controller.run();
    }
}
