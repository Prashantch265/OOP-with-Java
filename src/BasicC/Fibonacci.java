package BasicC;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args)
    {
        int a,b,f,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n=");
        n=sc.nextInt();
        a=0;
        b=1;
        f=1;
        for(i=1;i<=n;i++)
        {
            System.out.println(f);
            f=a+b;
            a=b;
            b=f;
        }
    }
}
