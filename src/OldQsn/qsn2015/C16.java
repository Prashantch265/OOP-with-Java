package OldQsn.qsn2015;

import java.util.Scanner;

public class C16 {
    public static void main(String[] args){
        try{
            try{
                int dividend, divisor;
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the dividend and divisor");
                dividend = sc.nextInt();
                divisor = sc.nextInt();
                double data =  dividend / divisor;
                System.out.println("result"+data);

                int a[] = new int[10];
                a[11] = 12;
                System.out.println(a[11]);

            }catch (Exception e){
                System.out.println(e);
            }
        }catch(Exception e){
                    System.out.println(e);
        }
    }
}
