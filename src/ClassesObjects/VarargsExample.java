package ClassesObjects;

public class VarargsExample {
    static void display(String...values){
        System.out.println("Display method invoked");
        for(String s:values){
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        display();//zero argument
        display("hello");//one argument
        display("my "+"name "+"is "+"prashant");//multiple arguments
    }
}
