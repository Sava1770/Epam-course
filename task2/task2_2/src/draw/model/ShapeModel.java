package draw.model;

import draw.entity.Circle;
import draw.entity.Rectangle;
import draw.entity.Shape;
import draw.entity.Triangle;

public class ShapeModel {

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

    public double sumCalcAllArea(){

        double sum = 0;

        for(int i = 0; i < shapes.length; i++){
            sum += shapes[i].calcArea();
        }
        return sum;
    }

    public double sumCalcArea(Shape choice){

        double sum = 0;

        for(int i = 0; i < shapes.length; i++){

          if(shapes[i] instanceof Triangle && choice instanceof Triangle)
            sum += shapes[i].calcArea();
          if(shapes[i] instanceof Rectangle && choice instanceof Rectangle)
            sum += shapes[i].calcArea();
          if(shapes[i] instanceof Circle && choice instanceof Circle)
            sum += shapes[i].calcArea();

        }
        return sum;
    }

}
