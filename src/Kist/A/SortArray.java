package Kist.A;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 names:");
        String[] name = new String[10];
        for (int i = 0; i < name.length ; i++) {
            name[i]=sc.next();
        }
        for (int i = 0; i < name.length; i++) {
            for (int j = 1; j < name.length ; j++) {
                if(name[j-1].compareTo(name[j])>0){
                    String temp = name[j-1];
                    name[j-1] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (int i = 0; i < name.length ; i++) {
            System.out.println(name[i]);
        }
    }
}
