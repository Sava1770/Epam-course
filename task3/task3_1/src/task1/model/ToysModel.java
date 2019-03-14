package task1.model;

import task1.entity.ChildRoom;
import task1.entity.Toys;
import task1.model.comparators.*;

import java.util.ArrayList;
import java.util.Comparator;

public class ToysModel {

    private ArrayList<Toys> list;


    public ToysModel(ChildRoom <Toys> room){
        list = room.getList();
    }

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

    public ArrayList<Toys> comparison(Comparator<Toys> comp){
        list.sort(comp);
        return list;
    }

}
