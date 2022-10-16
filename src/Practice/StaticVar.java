package Practice;

class Stat{
    static int a=1;
    static void disp(){
        System.out.println(a);
    }
}
class Stat1{
    void incr(){
        System.out.println(Stat.a++);
    }
}
class Stat2{
    void incr(){
        System.out.println(Stat.a++);
    }
}
class Stat3{
    void meth(int c){
        System.out.println(c);
    }
}

public class StaticVar {
    static{
        int b=3;
        System.out.println(b);
        int c=b*3;
        Stat3 obj3=new Stat3();
        obj3.meth(c);
    }
    public static void main(String[] args){
        Stat1 obj1=new Stat1();
        Stat2 obj2=new Stat2();
        obj1.incr();
        obj2.incr();
        Stat.disp();
    }
}
