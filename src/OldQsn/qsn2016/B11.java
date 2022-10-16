package OldQsn.qsn2016;

import java.util.Scanner;

public class B11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>16 && a[i]<47){
                System.out.println(a[i]);
            }
        }
    }
}
