package draw.model.comparators;

import draw.entity.Shape;

import java.util.Comparator;

public class ColorCompare implements Comparator<Shape> {

    public int compare(Shape s1, Shape s2) {
        return s1.getShapeColor().compareToIgnoreCase(s2.getShapeColor());
    }
}
