package Practice;

class Parameterless{
    int a,b;
    public Parameterless(){
        this.a=5;
        this.b=2;
    }
}
public class ParameterlessConstructer {
    public static void main(String[] args){
        Parameterless obj=new Parameterless();
        System.out.println(obj.a+obj.b);
    }
}
