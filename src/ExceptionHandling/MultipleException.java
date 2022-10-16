package ExceptionHandling;

import java.util.Scanner;

public class MultipleException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the dividend:");
        a=sc.nextInt();
        System.out.println("Enter the divisor:");
        b=sc.nextInt();
        System.out.println("Enter the size of array:");
        c=sc.nextInt();
        try{
        System.out.println("result"+a/b);
        int[] array=new int[c];
        array[6]=10;
        System.out.println(array[6]);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
