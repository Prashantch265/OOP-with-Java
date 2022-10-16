package PackA;

import PackB.ClassB;
class Rectangle{
    public static void main(String[] args){
        ClassA obj1=new ClassA();
//        ClassB obj2=new ClassB();
        obj1.area(6,4);
    }

}

public class ClassA {
    public void area(int l,int b){
        System.out.println("Area="+l*b);
    }
}

