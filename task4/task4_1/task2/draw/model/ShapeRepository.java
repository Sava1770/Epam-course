package Task4_1.task2.draw.model;

import Task4_1.task2.draw.entity.Circle;
import Task4_1.task2.draw.entity.Rectangle;
import Task4_1.task2.draw.entity.Shape;
import Task4_1.task2.draw.entity.Triangle;

public class ShapeRepository {
    private Shape[] shapes = new Shape[] {new Triangle("green",24,55,32),
            new Circle("yellow", 20),
            new Circle("white", 30),
            new Rectangle("pink", 20, 30),
            new Triangle("blue", 40,30,25),
            new Rectangle("red", 12,24),
            new Circle("green", 34),
            new Rectangle("yellow",19,25),
            new Triangle("black", 32,43,32),
            new Rectangle("black",58,43),
            new Circle("blue", 35)};

    public Shape[] getShapes() {
        return shapes;
    }
}
