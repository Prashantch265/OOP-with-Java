package ClassesObjects;

class ByDataType{
    void method(int a,int b) {
        System.out.println(a+b);
    }
    void method(double a,double b) {
        System.out.println(a*b);
    }
}
public class MethOverloadingByType {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ByDataType ob=new ByDataType();
        ob.method(5,5);
        ob.method(2,4.5);
    }

}

