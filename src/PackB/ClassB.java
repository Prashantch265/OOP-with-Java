package PackB;

import PackA.ClassA;
class Measurement{
    double l,b;
}
public class ClassB {
    public static void main(String[] args){
        Measurement m=new Measurement();
        ClassA obj=new ClassA();
        m.l = 5.5;
        m.b = 3.6;
        double p;
        p = 2 * (m.l + m.b);
        System.out.println("Perimeter=" + p);
        obj.area(5,3);
    }
}
