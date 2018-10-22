package task3.task1.controller;

import task3.task1.entity.Toys;
import task3.task1.view.Input;
import task3.task1.model.ToysModel;
import task3.task1.model.comparators.*;
import task3.task1.view.Constants;
import task3.task1.view.ToysView;

import java.util.ArrayList;

import static task3.task1.view.Constants.*;

public class ToysController {


    private ToysModel model = new ToysModel();
    private ToysView view = new ToysView(model);
    private ColorCompare colorCompare = new ColorCompare();
    private IdCompare idCompare = new IdCompare();
    private WeightCompare weightCompare = new WeightCompare();
    private Constants con = new Constants();
    private ArrayList<Toys> list = model.getList();



    public void run() {

        switch (Input.inputValue(view, OUTPUT_SELECT_FIRST)){
            case 1:
                list = model.idComp();
                view.printAfterSort(list);
                break;
            case 2:
                list = model.weightComp();
                view.printAfterSort(list);
                break;
            case 3:
                list = model.colorComp();
                view.printAfterSort(list);
                break;
            case 4:
                list = model.costComp();
                view.printAfterSort(list);
                break;
            case 5:
                view.printSum();
                break;
            case 6:
                chose();
                break;
            default:
                break;
        }
    }

    public void chose(){

     int max = Input.inputValue(view, INPUT_FIRST_PARAMETER);
        String str = Input.inputLine(view, INPUT_SECOND_PARAMETER);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getColor().equals(str)){
                if(list.get(i).getCost() <= max) {
                    view.printChosen(list, i);
                }
            }
        }



    }
}
