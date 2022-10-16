package Practice;

class CbV{
    //int a,b;
    int meth(int c,int d) {
        c*=2;
        d*=3;
        return c;
    }
}
public class CallbyValue {
    public static void main(String[] args){
        int c=2,d=3;
        CbV obj=new CbV();
        System.out.println(obj.meth(c,d));
    }
}
