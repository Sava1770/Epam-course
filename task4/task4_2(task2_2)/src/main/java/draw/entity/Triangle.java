package draw.entity;

public class Triangle extends Shape {
        private double a,b,c;

        public Triangle(){}

        public Triangle(String shapeColor, double a, double b, double c) {
                super(shapeColor);
                this.a = a;
                this.b = b;
                this.c = c;
        }

        @Override
        public String toString(){
                String str;

                str = "name: Triangle"+
                        ", a = " + a +
                        ", b = " + b +
                        ", c = " + c;

                str += super.toString();

                return str;
        }

        @Override
        public double calcArea() {
          double p = (a+b+c)/2;

          return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }

        public void draw(){
                String str = toString();
                System.out.println(str + "\nthe square of figure = " + calcArea());
        }
}
