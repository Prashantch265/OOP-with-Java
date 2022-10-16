package Practice;

import com.sun.java.accessibility.util.EventID;

class Conover{
    int a,b;
    public Conover(){
        this.a=2;
        this.b=3;
    }
    public Conover(int a,int b){
        this.a=a;
        this.b=b;
        //System.out.println(a+b);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args){
        Conover obj=new Conover(4,5);
        System.out.println(obj.a+obj.b);
       //System.out.println(obj.a+obj.b);
    }
}
