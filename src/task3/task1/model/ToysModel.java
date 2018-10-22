package task3.task1.model;

import task3.task1.entity.ChildRoom;
import task3.task1.entity.Toys;
import task3.task1.model.comparators.*;

import java.util.ArrayList;

public class ToysModel {

    private ChildRoom<Toys> room = new ChildRoom<>();
    private ArrayList<Toys> list = room.getList();
    private ColorCompare colorCompare = new ColorCompare();
    private IdCompare idCompare = new IdCompare();
    private WeightCompare weightCompare = new WeightCompare();
    private CostCompare costCompare = new CostCompare();

    public ArrayList<Toys> getList() {
        return list;
    }

    public int calcSumPrice(){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i).getCost();
        }
        return sum;
    }

    public ArrayList<Toys> colorComp(){
         list.sort(colorCompare);
         return list;
    }

    public ArrayList<Toys> idComp(){
        list.sort(idCompare);
        return list;
    }

    public ArrayList weightComp(){
        list.sort(weightCompare);
        return list;
    }

    public ArrayList costComp(){
        list.sort(costCompare);
        return list;
    }



}
