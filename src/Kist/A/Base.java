package Kist.A;

abstract class Figure{
    double dimension1,dimension2;
    public Figure(double dimension1,double dimension2){
        this.dimension1=dimension1;
        this.dimension2=dimension2;
    }
    abstract void Area();
}

class Triangle extends Figure{
    public Triangle(double dimension1, double dimension2){
        super(dimension1,dimension2);
    }
    @Override
    void Area() {
        double area =0.5*dimension1*dimension2;
        System.out.println("Area:"+area);
    }
}

class Rectangle extends Figure{
    public Rectangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    @Override
    void Area() {
        double area = dimension1*dimension2;
        System.out.println("Area:"+area);
    }
}
public class Base {
    public static void main(String[] args){
        Triangle obj1 = new Triangle(5.5,7.5);
        Rectangle obj2 = new Rectangle(2.5,2);
        obj1.Area();
        obj2.Area();
    }
}
