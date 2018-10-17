package task2.draw;


public class Circle extends Shape {
    private double radius = 0;

    public Circle(){

    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;

    }

    @Override
    public String toString(){

        String str = "name: Circle, radius = " + radius;

        str += super.toString();

        return str;
    }

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public void draw(){
        String str = toString();
        System.out.println(str + "\nthe square of figure = " + calcArea());
    }
}
