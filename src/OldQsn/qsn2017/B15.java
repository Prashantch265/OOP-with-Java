package OldQsn.qsn2017;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class B15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String employee_id, name, address, dob, phone_no;
        try {
            File obj1 = new File("d:/Oldqsn", "Emp.txt");
            if (!obj1.exists()) {
                obj1.createNewFile();
            }
            FileWriter obj2 = new FileWriter(obj1);
            System.out.println("Enter the Employee_id");
            employee_id = sc.next();
            obj2.write(employee_id);
            System.out.println("Enter the Name");
            name = sc.next();
            obj2.write(name);
            System.out.println("Enter the Address");
            address = sc.next();
            obj2.write(address);
            System.out.println("Enter the Date of Birth");
            dob = sc.next();
            obj2.write(dob);
            System.out.println("Enter the phone no.");
            phone_no = sc.next();
            obj2.write(phone_no);
            obj2.close();
            FileReader obj3 = new FileReader(obj1);
            int c;
            while ((c = obj3.read()) !=  -1){
                System.out.print((char)c);
            }
            obj3.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}