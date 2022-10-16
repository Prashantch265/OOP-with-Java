package BasicC;

import java.util.Scanner;
public class GreatestArray {
    public static void main(String[] args)
    {
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter 10 numbers");
        n=sc.nextInt();
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        j=a[0];
        for(i=0;i<10;i++)
        {
            if(a[i]>j)
            {
                j=a[i];
            }

        }
        System.out.println("Greatest number is"+j);
    }
}
