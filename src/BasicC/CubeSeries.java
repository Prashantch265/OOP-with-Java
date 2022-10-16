package BasicC;

import java.util.Scanner;
public class CubeSeries {
    public static void main(String[] args)
    {
        int n,i,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n=");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            c=i*i*i;
            System.out.println(c);
        }
    }
}
