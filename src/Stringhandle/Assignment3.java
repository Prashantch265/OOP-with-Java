package Stringhandle;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        String[] name = new String[10];
        for (i=0;i<name.length;i++){
            System.out.println("Enter name:");
             name[i] = sc.next();
        }
        for (i=0;i<name.length;i++){
            if(name[i].startsWith("a")&&name[i].endsWith("a"))
            {
                System.out.println("Name starting and ending with a");
                System.out.println(name[i]);
            }
        }
    }
}
