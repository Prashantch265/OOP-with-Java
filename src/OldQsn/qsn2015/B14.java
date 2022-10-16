package OldQsn.qsn2015;

import java.util.Scanner;

class Rectangle{
    double length, breadth, area;
    void computeArea(double length, double breadth){
        area = length * breadth;
    }
    void displayArea(){
        System.out.println("Area = "+this.area);
    }
}
public class B14 {
    public static void main(String[] args){
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("1st object");
        System.out.println("Enter length and breadth");
        obj1.computeArea(sc.nextDouble(),sc.nextDouble());
        System.out.println("2nd object");
        System.out.println("Enter length and breadth");
        obj2.computeArea(sc.nextDouble(),sc.nextDouble());
        if(obj1.area > obj2.area){
            obj1.displayArea();
        }else {
            obj2.displayArea();
        }
    }
}
