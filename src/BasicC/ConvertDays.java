package BasicC;

import java.util.Scanner;
public class ConvertDays {
    public static void main(String[] args)
    {
    int days,y,m,rd;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Days=");
    days=sc.nextInt();
    y=days/365;
    rd=days%365;
    m=rd/30;
    rd=rd%30;
    System.out.println("year="+y+"\nMonth="+m+"\nRemaining Days="+rd);
}
}
