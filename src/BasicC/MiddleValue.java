package BasicC;

import java.util.Scanner;
public class MiddleValue {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b||a==c||b==c)
        {
            System.out.println("Enter different numbers");
        }
        else if((a>b&&a<c)||(a<b&&a>c))
        {
            System.out.println(a+" is middle number.");
        }
        else if((b>a&&b<c)||(b<a&&b>c))
        {
            System.out.println(b+" is middle number.");
        }
        else if((c>a&&c<b)||(c<a&&c>b))
        {
            System.out.println(c+" is middle number.");
        }
    }
}
