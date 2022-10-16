package WrapperClass;

class change{
    int a=2;
    void change(int a){
        a=a+2;
    }
}

public class CallByValue {
    public static void main(String[] args){
        change obj = new change();
        System.out.println("Before call:"+obj.a);
        obj.change(50);
        System.out.println("after call:"+obj.a);
    }
}
