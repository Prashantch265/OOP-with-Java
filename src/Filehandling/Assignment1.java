package Filehandling;

import java.io.File;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        File f=new File("d:/country");
        Scanner sc=new Scanner(System.in);
        File[] fa=new File[5];
        if(!f.exists()){
            f.mkdir();
            for (int i = 0; i < fa.length; i++) {
                System.out.println("Enter country name=");
                String name=sc.next();
                fa[i] = new File(f,name);
                if(!fa[i].exists()){
                    fa[i].mkdir();
                }
            }
        }

    }
}
