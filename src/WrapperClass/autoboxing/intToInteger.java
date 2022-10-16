package WrapperClass.autoboxing;

public class intToInteger {
    public static void main(String[] args){
        int a=20;
        Integer i=Integer.valueOf(a);   //Explicit conversion
        Integer j=a;
        System.out.println("Explicit Conversion:"+i);
        System.out.println("Autoboxing:"+j);
    }
}
