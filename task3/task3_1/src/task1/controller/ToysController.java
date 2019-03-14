package task1.controller;

import task1.entity.Toys;
import task1.model.comparators.ColorComparator;
import task1.model.comparators.CostComparator;
import task1.model.comparators.IdComparator;
import task1.model.comparators.WeightComparator;
import task1.view.Input;
import task1.model.ToysModel;
import task1.view.ToysView;

import java.util.ArrayList;

import static task1.view.Constants.*;

public class ToysController {
    private ToysModel model ;
    private ToysView view;
    private ArrayList<Toys> list;
    private ColorComparator colorCompare = new ColorComparator();
    private IdComparator idCompare = new IdComparator();
    private WeightComparator weightCompare = new WeightComparator();
    private CostComparator costCompare = new CostComparator();

    public ToysController(ToysModel model, ToysView view, ArrayList<Toys> list){
        this.model = model;
        this.view = view;
        this.list = list;
    }


    public void run() {

        switch (Input.inputValue(view, OUTPUT_SELECT_FIRST)){
            case 1:
                list = model.comparison(idCompare);
                view.printAfterSort(list);
                break;
            case 2:
                list = model.comparison(weightCompare);
                view.printAfterSort(list);
                break;
            case 3:
                list = model.comparison(colorCompare);
                view.printAfterSort(list);
                break;
            case 4:
                list = model.comparison(costCompare);
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

    private void chose(){

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
