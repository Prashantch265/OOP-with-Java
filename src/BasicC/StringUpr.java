package BasicC;
import java.util.Scanner;
public class StringUpr {
    public static void main(String[] args)
    {
        String str=new String();
        Scanner sc=new Scanner(System.in);
        String a;
        System.out.println("Enter string in lowercase:");
        str=sc.next();
        System.out.println(str.toUpperCase());
    }
}
