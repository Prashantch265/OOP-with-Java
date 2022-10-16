package BasicC;

import java.util.Scanner;

public class PerfectSq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        double b,n;
        System.out.println("Enter the number:");
        n = sc.nextDouble();
        a = (int) Math.sqrt(n);
        b = Math.sqrt(n);
        if(a==b){
           System.out.println(n+"is a perfect sq. of"+a);
        }
        else {
            System.out.println(n+"is not a perfect sq.");
        }
    }
}
