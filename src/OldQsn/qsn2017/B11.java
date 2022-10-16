package OldQsn.qsn2017;

import java.util.Scanner;

public class B11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        int[] a = new int[n];
        for (n=0; n < a.length; n++){
            System.out.println("Enter the numbers");
            a[n] = sc.nextInt();
        }
        for (n=0; n < a.length; n++){
            if((a[n]%2==0)&&(a[n]%3==0)){
                System.out.println(a[n]);
            }
        }
    }
}
