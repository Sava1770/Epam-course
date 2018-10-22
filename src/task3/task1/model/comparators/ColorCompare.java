package task3.task1.model.comparators;

import task3.task1.entity.Toys;

import java.util.Comparator;

public class ColorCompare implements Comparator<Toys> {

    @Override
    public int compare(Toys t1, Toys t2) {
        return t1.getColor().compareToIgnoreCase(t2.getColor());
    }
}
