package Practice;
class Vehicle{
    void disp(){
        System.out.println("Running");
    }
}
class Spleder extends Vehicle{
    void disp(){
        System.out.println("in 50");
    }
}
class R15 extends Vehicle{
    void disp(){
        System.out.println("in 110");
    }
//    @Override
//    void disp() {
//        super.disp();
//    }
}
public class DyanamicmethDisp {
    public static void main(String[] args){
        Vehicle obj;
        obj=new Spleder();
        obj.disp();
        obj=new R15();
        obj.disp();
    }
}
