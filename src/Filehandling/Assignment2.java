package Filehandling;

import java.io.File;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to create directory or 2 to create file");
        n = sc.nextInt();
        try {
            switch (n) {
                case 1:
                    System.out.println("Enter the name of directory");
                    String name1 = sc.next();
                    File f1 = new File("d:/",name1);
                    if (!f1.exists()) {
                        f1.mkdir();
                    }
                    break;


                case 2:
                    System.out.println("Enter the name of file");
                    String name2 = sc.next();
                    File f2 = new File( name2 + ".txt");
                    if (!f2.exists()) {
                        f2.createNewFile();
                    }
                    break;
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}