package WrapperClass;

class Operation{
    int a=2;
    void change(Operation obj){
        obj.a=obj.a+2;
    }
}
public class CallByRef {
    public static void main(String[] args){
        Operation obj = new Operation();
        System.out.println("Before call:"+obj.a);
        obj.change(obj);  //passing obj
        System.out.println("After call:"+obj.a);
    }
}
