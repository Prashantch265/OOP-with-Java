package OldQsn.qsn2019;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class B15 {
    public static void main(String[] args){
        try{
            File f = new File("d:/Oldqsn","College.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            FileWriter obj = new FileWriter(f);
            Scanner sc = new Scanner(System.in);
            String name,address,number;
            for (int i = 0; i < 3 ; i++) {
                System.out.println("Enter the College name");
                name = sc.next();
                obj.write(name);
                System.out.println("Enter the address");
                address = sc.next();
                obj.write(address);
                System.out.println("Enter the number of students");
                number = sc.next();
                obj.write(number);
            }
            obj.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
