package task3.task1.model.comparators;

import task3.task1.entity.Toys;

import java.util.Comparator;

public class CostCompare implements Comparator<Toys> {
    @Override
    public int compare(Toys s1, Toys s2) {
            if(s1.getCost() > s2.getCost())
                return 1;
            else
                return -1;
    }
}