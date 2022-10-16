package Filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadString {
    public static void main(String[] args){
        try{
            FileInputStream f = new FileInputStream("d:/Assignment/writestring.txt");
            FileOutputStream f2 = new FileOutputStream("d:/Assignment/copy.txt");
            int c;
            while ((c = f.read()) != -1){
                System.out.println((char)c);
                f2.write(c);
            }
            f.close();
            f2.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
