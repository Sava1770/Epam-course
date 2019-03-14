package draw.entity;

public abstract class Shape implements Drawable{

    private String shapeColor;

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }
    public Shape(){}


    public String getShapeColor() {
        return shapeColor;
    }

    public abstract double calcArea();


    @Override
    public String toString(){

        return ", color: " + shapeColor;
    }

}
