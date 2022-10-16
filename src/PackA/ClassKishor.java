package PackA;

import PackB.ClassA;
public class ClassKishor {
    void area(int r){
        System.out.println("area"+r*r*3.1416);
    }
}
class Circle{
    public static void main(String[] args) {
        ClassKishor obj = new ClassKishor();
        ClassA obj1 = new ClassA();
        obj.area(4);
        obj1.circumference(6);
    }
}
