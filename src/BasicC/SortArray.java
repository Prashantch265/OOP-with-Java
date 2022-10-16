package BasicC;

import java.util.Scanner;
public class SortArray {
    public static void main(String[] args)
    {
        int a[]=new int[10];
        int i,j,temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }

        for(i=0;i<10-1;i++)
        {
            for(j=0;j<10-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Output After Sorting");
        for(i=0;i<10;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
