package Kist.B;


import java.util.Scanner;

public class qsn2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] a =  new int[10];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i+1]<a[i]){
                System.out.println("not sorted");
                break;
            }else {
                System.out.println("Sorted");
            }
        }
    }
}
