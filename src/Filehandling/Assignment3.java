package Filehandling;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Assignment3{
    public static void main(String[] args){
        File f1 = new File("d:/Assignment");
        if(!f1.exists()){
            f1.mkdir();
        }
        try {
            File f2 = new File("d:/Assignment", "file1.txt");
            if (!f2.exists()) {
                f2.createNewFile();
            }
            File f3 = new File("d:/Assignment","file2.txt");
            if(!f3.exists()){
                f3.createNewFile();
            }
            String s="Writing into file using CharacterStream";
            FileWriter obj1 = new FileWriter("d:/Assignment/file1.txt");
            obj1.write(s);
            obj1.close();
            FileReader obj2 = new FileReader("d:/Assignment/file1.txt");
            int c;
            while ((c = obj2.read()) != -1) {
                System.out.print((char) c);
            }
            obj2.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}