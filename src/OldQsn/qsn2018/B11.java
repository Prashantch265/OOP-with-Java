package OldQsn.qsn2018;

import java.util.Scanner;

public class B11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m,n,sum=0;
        System.out.println("Enter the size of an array m*n = ");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] a = new int[m][n];
        for (m=0; m<a.length ;m++)
        {
            for (n=0; n<a.length; n++)
            {
                System.out.println("Enter the element"+m+" "+n);
                a[m][n]=sc.nextInt();
            }
        }
        for (m=0; m<a.length; m++)
        {
            for (n=0; n<a.length; n++)
            {
                sum = sum + a[m][n];
                System.out.print(a[m][n]+"\t");
            }
            System.out.println();
        }
        System.out.println("Sum of elements = "+sum);
    }
}
