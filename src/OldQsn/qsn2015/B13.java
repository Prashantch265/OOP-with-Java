package OldQsn.qsn2015;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class B13 {
    public static void main(String[] args){
        File f = new File("d:/Oldqsn","B13_2015.txt");
        try{
            if (! f.exists()){
               f.createNewFile();
            }
            String input;
            Scanner sc = new Scanner(System.in);
            FileWriter obj1 = new FileWriter(f);
            System.out.println("Enter the text");
            input = sc.next();
            obj1.write(input);
            obj1.close();
            FileReader obj2 = new FileReader(f);
            int c;
            while ((c = obj2.read()) != -1){
                System.out.print((char)c);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
