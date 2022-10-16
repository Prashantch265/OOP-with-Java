package Practice;

class Parameterized{
    int a,b;
    public Parameterized(int l,int b){
        a=l;//different name no problem
       this.b=b;//same name >instance varaible hiding
    }
}
public class ParameterizedConstrutor {
    public static void main(String[] args){
        Parameterized obj=new Parameterized(2,5);
        System.out.println(obj.a+obj.b);
    }
}
