package OldQsn.qsn2017;

import java.util.Scanner;

public class B14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] countries = new String[10];
        for (int i = 0; i < countries.length; i++) {
            System.out.println("Enter the name of country");
            countries[i] = sc.next();
        }
        for (int i = 0; i < countries.length ; i++) {
            if (countries[i].endsWith("a"))
            System.out.println(countries[i]);
        }
    }
}
