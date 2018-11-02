package Task4_1.task2.draw.model.comparators;

import Task4_1.task2.draw.entity.Shape;

import java.util.Comparator;

public class ColorCompare implements Comparator<Shape> {

    @Override
    public int compare(Shape s1, Shape s2) {
        return s1.getShapeColor().compareToIgnoreCase(s2.getShapeColor());
    }
}
