package BasicC;

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int n, r, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not prime.");
                break;
            }
        }
        if (i == n) {
            System.out.println(n + " is prime.");
        }
    }
}
