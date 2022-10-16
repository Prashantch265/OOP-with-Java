package Kist.B;

import java.util.Scanner;

public class SortNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] a = new int[10];
        int i;
        for (i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int g=a[0];
        for (i = 0; i<a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
