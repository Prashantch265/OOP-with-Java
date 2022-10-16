package BasicC;

import java.util.Scanner;
public class FeetInches {
    public static void main(String[] args)
    {
        int f,f1,f2,i,i1,i2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st distance in feet & inch:");
        f1=sc.nextInt();
        i1=sc.nextInt();
        System.out.println("Enter the 2nd distance in feet & inch:");
        f2=sc.nextInt();
        i2=sc.nextInt();
        i=(i1+i2)%12;
        f=f1+f2+((i1+i2)/12);
        System.out.println("Feet="+f+"\nInch="+i);
    }

}
