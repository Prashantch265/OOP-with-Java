package Practice;
class Super{
    int a=3;
}
class Sub extends Super{
    int a=2;
    int getsup(){
       return super.a;
    }
}
public class Super1 {
    public static void main(String[] args){
        Super obj=new Sub();
        System.out.println(((Sub)obj).getsup());

    }
}
