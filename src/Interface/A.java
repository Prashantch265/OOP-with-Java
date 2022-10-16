package Interface;

interface BasicCalc{
    int add(int a,int b);
    int sub(int a,int b);
    int div(int a,int b);
    int mul(int a,int b);
}
class Calculator implements BasicCalc{
    public int add(int a,int b)
    {
        return a+b;

    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
public class A{
public static void main(String[] args){
        Calculator obj=new Calculator();
        System.out.println(obj.add(5,6));
        System.out.println(obj.sub(5,6));
        System.out.println(obj.mul(5,6));
        System.out.println(obj.div(4,2));
}
}

