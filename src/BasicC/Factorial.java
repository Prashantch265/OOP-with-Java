package BasicC;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args)
    {
        int i,n;
        long fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input any number");
        n= sc.nextInt();
        if(n<0)
        {
            System.out.println("Invalid number");
        }
        else if(n==0||n==1)
        {
            System.out.println("Factorial of"+n+"is 1");
        }
        else {
            for(i=1;i<=n;i++)
            {
              fact=fact*i;
            }
            System.out.println("Factorial of "+n+" is "+fact);
        }
    }
}
