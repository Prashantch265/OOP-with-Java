package Practice;

class Constructor{
  int a=2,b=5;
}
public class DefaultConstructor {
    public static void main(String[] args){
        Constructor obj=new Constructor();//default constructor called
        System.out.println(obj.a+obj.b);
    }
}
