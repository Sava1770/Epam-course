package task3.task1.model.comparators;

import task3.task1.entity.Toys;

import java.util.Comparator;

public class WeightCompare implements Comparator<Toys> {
    @Override
    public int compare(Toys s1, Toys s2) {
        if(s1.getWeight() > s2.getWeight())
            return 1;
        else
            return -1;
    }
}