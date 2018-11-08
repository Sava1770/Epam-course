package main;

import controller.BankController;
import model.BankModel;
import model.BankRepository;
import view.BankView;

/**
 * @author Savostin Roman
 */
public class Main {
    /**
     * start program
     * creating all instances
     */
    public static void main(String[] args){
        BankRepository repository = new BankRepository();
        BankModel model = new BankModel(repository);
        BankView view = new BankView();

        BankController controller = new BankController(view,model);
        controller.run();
    }

}
