package Practice;

import java.util.Scanner;

class Person{
    private String name,birthdate;
    public void readData(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        birthdate = sc.next();
    }
    public void display()
    {
        System.out.println("Name="+name+"\n"+"Birth date="+birthdate);
    }
}

class Student extends Person{
    private String gpa,year;
    Scanner sc = new Scanner(System.in);
    @Override
    public void readData() {
        super.readData();
        gpa = sc.next();
        year = sc.next();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("GPA="+gpa+"\n"+"Graduation year="+year);
    }
}
public class StudentDemo {
    public static void main(String[] args){
        Student obj = new Student();
        obj.readData();
        obj.display();
    }
}
