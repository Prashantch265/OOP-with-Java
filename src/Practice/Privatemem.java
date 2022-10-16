package Practice;

class Outer{
    private int a=2;

    int memAccess(){
        return a;
    }
    class Inner{
        int b=3;
        void disp(){
            System.out.println(b);
        }
    }
    void innerAccess(){
        Inner access=new Inner();
        access.disp();
    }

}

public class Privatemem {
    public static void main(String[] args){
        Outer obj=new Outer();
        System.out.println(obj.memAccess());
        obj.innerAccess();

    }
}
