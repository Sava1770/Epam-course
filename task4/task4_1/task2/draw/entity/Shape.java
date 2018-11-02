package Task4_1.task2.draw.entity;

public abstract class Shape implements Drawable{

    String shapeColor;

    public Shape(){

    }

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString(){

      //  System.out.println("color: " + shapeColor);
        return ", color: " + shapeColor;
    }

}
