package Practice;

class A1{
    int b;
    public A1(int b){
        this.b=b;
    }
}
class B1 extends A1{
    public B1(int val){
        super(val);
    }
    int b=2;
    public int getSup(){
        return super.b;
    }
}
public class Super2 {
    public static void main(String[] args){
        B1 obj=new B1(5);
        System.out.println(obj.b);
        System.out.println(obj.getSup());
    }
}
