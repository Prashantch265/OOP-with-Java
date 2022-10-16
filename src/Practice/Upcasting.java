package Practice;

class A{
    int a;
    public A(){
        this.a=3;
        System.out.println("2");
    }
}
class B extends A{
    int b=5;
    public B(){
        System.out.println("4");
    }
}
public class Upcasting {
    public static void main(String[] args){
        A obj=new B();
        System.out.println(((B)obj).b);
    }
}
