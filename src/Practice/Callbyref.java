package Practice;

class Cbr{
    int a,b;
    public Cbr(){
        this.a=2;
        this.b=3;
    }
    void meth(Cbr obj){
        System.out.println(a+b);
    }
}
public class Callbyref {
    public static void main(String[] args){
        Cbr obj=new Cbr();
        obj.meth(obj);
    }
}
