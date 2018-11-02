package draw;

import book.Book;

import java.util.Comparator;

public class ColorCompare implements Comparator<Shape> {

    @Override
    public int compare(Shape s1, Shape s2) {
        return s1.getShapeColor().compareToIgnoreCase(s2.getShapeColor());
    }
}
