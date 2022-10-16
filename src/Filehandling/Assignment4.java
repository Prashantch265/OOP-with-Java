package Filehandling;

import java.io.File;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){
        File f = new File("d:/StartsAndEndsWith");
        if(!f.exists()){
            f.mkdir();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. file want to create:");
        int n = sc.nextInt();
        File[] f1 = new File[n];
        try {
            for (int i = 0; i < f1.length; i++) {
                System.out.println("Enter the file name:");
                String s = sc.next();
                f1[i] = new File("d:/StartsAndEndsWith",s);
                if(!f1[i].exists()){
                    f1[i].createNewFile();
                }
            }
            for (int i = 0; i < f1.length; i++) {
                String[] name = new String[f1.length];
                name[i] = f1[i].getName();
                if(name[i].startsWith("a")&&name[i].endsWith("a")){
                    System.out.println(name[i]);
                }
            }
        }catch (Exception e){
            System.out.print(e);
        }
    }
}
