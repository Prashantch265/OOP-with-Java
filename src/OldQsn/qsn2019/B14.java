package OldQsn.qsn2019;

import java.util.Scanner;

public class B14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] name = new String[7];
        System.out.println("Enter the name of 7 coutries:");
        for (int i = 0; i < name.length ; i++) {
            name[i] = sc.next();
        }
        int c=0;
        System.out.println("Countries that ends with Vowel");
        for (int i = 0; i < name.length; i++) {
            if(name[i].endsWith("a")||name[i].endsWith("e")||name[i].endsWith("i")||name[i].endsWith("o")
                    ||name[i].endsWith("u")){
                c++;
                System.out.println(name[i]);
            }
        }
        System.out.println("Number of Countries "+c);
    }
}
