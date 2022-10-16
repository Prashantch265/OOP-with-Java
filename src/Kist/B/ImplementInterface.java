package Kist.B;

interface calculate{
    void add();
    void sub();
}
class Arithmetic implements calculate{
    int a=5,b=2;
    public void add(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }
}
public class ImplementInterface {
    public static void main(String[] args){
        Arithmetic obj = new Arithmetic();
        obj.add();
        obj.sub();
    }
}
