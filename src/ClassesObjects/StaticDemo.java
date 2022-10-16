package ClassesObjects;
class StatTest{
    static int a=1;
    static void print(){
        System.out.println(a);
    }
}
class Atest{
    void incrTest(){
        StatTest.a++;
    }
}
class Btest{
    void incrTest1(){
        StatTest.a++;
    }
}
public class StaticDemo {
    public static void main(String[] args){
        Atest obj1=new Atest();
        Btest obj2=new Btest();
        obj1.incrTest();
        System.out.println(StatTest.a);
        obj2.incrTest1();
        System.out.println(StatTest.a);
        StatTest.print();
    }
}
