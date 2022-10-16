package Kist.A;


import java.util.Scanner;

public class Multiple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int i,s=0;
        for(i=1;i<=n;i++){
            s = s + (19 * i);
        }
        System.out.println("result="+s);
    }
}
