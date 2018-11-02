package Task4_1.task2.draw.model.comparators;

import Task4_1.task2.draw.entity.Shape;

import java.util.Comparator;

public class AreaCompare implements Comparator<Shape> {

    @Override
    public int compare(Shape s1, Shape s2) {
        if(s1.calcArea() > s2.calcArea())
            return 1;
        else
            return -1;
    }
}
