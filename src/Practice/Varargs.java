package Practice;
class Args{
    void varArgs(int a,String...var){
        for(String i:var){
            System.out.println(a+" "+i);
        }
    }
}
public class Varargs {
    public static void main(String[] args){
        Args obj=new Args();
        obj.varArgs(1,"prashant");
        obj.varArgs(2,"ashim"+"neupane");
    }
}
