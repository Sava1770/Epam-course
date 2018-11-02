package task1.view;


import task1.entity.Toys;
import task1.model.ToysModel;

import java.util.ArrayList;

public class ToysView {

    private ToysModel model;

    public ToysView(ToysModel model){
        this.model = model;
    }

    public void printAfterSort(ArrayList<Toys> list){
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public void printSum(){
        int sum;
        sum = model.calcSumPrice();
        System.out.println(sum);
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printChosen(ArrayList<Toys> list,int i){
        System.out.println(list.get(i).toString());
    }
}
