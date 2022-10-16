package ClassesObjects;


public class VarargsRule {
//    static void display(int...a,String...b)//only one varargs
//    {
//
//    }
//    static void display(int...a,String b)//varargs should be in last
//    {
//
//    }
    static void display(int a,String...b) {
        System.out.println(a);
        for (String s : b) {
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        display(5000,"hello "+"my "+"name "+"is "+"prashant");
    }
}
