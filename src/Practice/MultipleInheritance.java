package Practice;

interface Interface1{
    void disp();
}
interface Interface2{
    void disp1();
}
 class MultipleInterface implements Interface1,Interface2{
    @Override
    public void disp()
    {
        System.out.println("Hello");
    }
    @Override
    public void disp1()
    {
        System.out.println("Hi");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
     MultipleInterface obj = new MultipleInterface();
     obj.disp();
     obj.disp1();
    }
}
