package BasicC;

import java.util.Scanner;
public class SumEven {
    public static void main(String[] arags)
    {
        int i,n,s=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many terms");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
                s+=i;
        }
        System.out.println("Result="+s);
    }

}
