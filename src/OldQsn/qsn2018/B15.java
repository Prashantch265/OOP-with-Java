package OldQsn.qsn2018;

import java.io.*;
import java.util.Scanner;

public class B15 {
    public static void main(String[] args) {
        try {
            File obj = new File("d:/Oldqsn");
            if (!obj.exists()) {
                obj.mkdir();
            }
            File obj1 = new File("d:/Oldqsn","student.txt");
            if(!obj1.exists()){
                obj1.createNewFile();
            }
            File obj2 = new File("d:/Oldqsn","pupil.txt");
            if(!obj2.exists()){
                obj2.createNewFile();
            }

            String name, address, college;
            Scanner sc = new Scanner(System.in);
                FileWriter obj3 = new FileWriter(obj1);
                System.out.println("Enter name");
                name = sc.next();
                obj3.write(name);
                System.out.println("Enter address");
                address = sc.next();
                obj3.write(address);
                System.out.println("Enter college");
                college = sc.next();
                obj3.write(college);
                obj3.close();

                FileReader obj4 = new FileReader(obj1);
                FileWriter obj5 = new FileWriter(obj2);
                int c;
                while ( (c=obj4.read()) != -1 ){
//                    System.out.print((char)c);
                    obj5.write((char)c);
                }
            obj4.close();
            obj5.close();
            }catch (Exception e){
                System.out.println(e);
        }
    }
}
