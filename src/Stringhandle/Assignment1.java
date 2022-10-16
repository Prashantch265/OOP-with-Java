package Stringhandle;


import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        String[] name=new String[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < name.length ; i++) {
            System.out.println("Enter name:");
            name[i]=sc.next().toLowerCase();
        }
        for (int i = 0; i < name.length; i++) {
            for(int j=1; j<name.length; j++)
            {
                if(name[j-1].compareTo(name[j])>0)
                {
                   String temp=name[j-1];
                    name[j-1]=name[j];
                    name[j]=temp;
                }
            }
        }
        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }
    }
}
