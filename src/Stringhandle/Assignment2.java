package Stringhandle;

import java.util.Scanner;

public class Assignment2 {
    public  static  void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with atleast one i:");
        String a = sc.next();
        System.out.println(a.replace('i','!'));
    }
}
