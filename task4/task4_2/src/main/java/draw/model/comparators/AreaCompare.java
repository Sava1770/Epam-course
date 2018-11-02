package draw.model.comparators;

import draw.entity.Shape;

import java.util.Comparator;

public class AreaCompare implements Comparator<Shape> {


    public int compare(Shape s1, Shape s2) {
        if(s1.calcArea() > s2.calcArea())
            return 1;
        else
            return -1;
    }
}
