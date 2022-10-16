package WrapperClass.unboxing;

public class IntegerToint {
    public static void main(String[] args){
        Integer a=new Integer(3);
        int i=a.intValue();     //Explicit Conversion
        int j=a;    //unboxing
        System.out.println("Explicit Conversion:"+i);
        System.out.println("Unboxing:"+j);
    }
}
