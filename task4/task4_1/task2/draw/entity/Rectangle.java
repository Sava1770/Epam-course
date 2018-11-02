package Task4_1.task2.draw.entity;

public class Rectangle extends Shape {
    private double a,b;

    public Rectangle(){

    }

    public Rectangle(String shapeColor, double a, double b) {
        super(shapeColor);
        this.a = a;
        this.b = b;

    }

    @Override
    public String toString(){
        String str = "name: Rectangle"+
                ", a = " + a +
                ", b = " + b;


        str += super.toString();
        return str;
    }

    @Override
    public double calcArea() {
        double p = a+b;

        return Math.sqrt(p*(p-a)*(p-b)*(p-a)*(p-b));
    }

    @Override
    public void draw(){
        String str = toString();
        System.out.println(str + "\nthe square of figure = " + calcArea());
    }

}
