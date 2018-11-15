package controller;

import model.GenerateModel;
import view.GenerateView;

public class GenerateController {

    private GenerateModel model;
    private GenerateView view;

    public GenerateController(GenerateModel model, GenerateView view){
        this.model = model;
        this.view = view;
    }

    public void run(){

       model.generateList(10);
       model.generateSet(10);
       view.printList(model.getList());
       view.printSet(model.getSet());

    }
}
