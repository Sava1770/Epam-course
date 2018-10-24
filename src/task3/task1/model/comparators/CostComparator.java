package task3.task1.model.comparators;

import task3.task1.entity.Toys;

import java.util.Comparator;

public class CostComparator implements Comparator<Toys> {
    @Override
    public int compare(Toys s1, Toys s2) {
           return Integer.compare(s1.getCost(),s2.getCost());
    }


}