package OldQsn.qsn2018;

import java.util.Scanner;

public class B14 {
    public static void main(String[] args){
        String name[] = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < name.length ; i++) {
            System.out.println("Enter name");
            name[i] = sc.next();
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i].replace("i","!"));
        }
    }
}
