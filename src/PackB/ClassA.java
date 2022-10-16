package PackB;

public class ClassA {
    public void circumference(int r){
        System.out.println("Circumference"+2*3.1416*r);
    }
}
class Kishor{
    public static void main(String[] args){
        ClassA obj=new ClassA();
        obj.circumference(5);
    }
}
