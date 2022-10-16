package OldQsn.qsn2017;

import java.util.Scanner;

class Student{
    int roll_no;
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll no.");
        roll_no = sc.nextInt();
    }
    void display(){
        System.out.println("Roll no. = "+roll_no);
    }
}

class Test extends Student{
    int marks1, marks2;
    Scanner sc = new Scanner(System.in);
    @Override
    void read() {
        super.read();
        System.out.println("Enter the marks of Java");
        marks1 = sc.nextInt();
        System.out.println("Enter the marks of CO");
        marks2 = sc.nextInt();
    }

    @Override
    void display() {
        super.display();
        System.out.println("Java = "+marks1+"\n"+"CO = "+marks2);
    }
}

class Result extends Test{
    int total;
    void calculate(){
        total = super.marks1 + super.marks2;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Total = "+total);
    }
}
public class B12 {
    public static void main(String[] args){
        Test obj1 = new Test();
        obj1.read();
        Result obj2 = new Result();
        obj2.calculate();
        obj2.display();
    }
}
