package controller;

import model.VocabularyModel;
import view.Constants;
import view.InputUtility;
import view.VocabularyView;

import static view.Constants.*;

public class VocabularyController {

    private VocabularyModel model;
    private VocabularyView view;
    private InputUtility input = new InputUtility();

    public VocabularyController(VocabularyModel model, VocabularyView view){
        this.model = model;
        this.view = view;
    }

    public void run(){
        String value, key, valueForPair;

        model.init();
        do{
            value = input.inputString(view, INPUT_KEY);

            if(value.equals("exit")){
                break;
            }
            else if(value.equals("add")){
                key = input.inputString(view,INPUT_PAIR_KEY);
                valueForPair = input.inputString(view,INPUT_PAIR_VALUE);
                model.addPair(key, valueForPair);
            }else if(model.getPair(value) != null) {
                view.printMessage(model.getPair(value));
            }else if(!value.equals("add")){
                view.printMessage(WRONG);
            }
        }while(true);




    }
}
