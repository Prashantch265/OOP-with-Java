package BasicC;

import java.util.Scanner;
public class PrintPrime {
    public static void main(String[] args)
    {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j||i==1)
                System.out.print(i);
        }
    }
}
