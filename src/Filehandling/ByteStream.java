package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream{
    public static void main(String[] args){
        try{
            File f = new File("d:/Assignment","ByteStream.txt");
            FileOutputStream obj1 = new FileOutputStream(f);
            obj1.write(67);
            obj1.close();
            FileInputStream obj2 = new FileInputStream(f);
            System.out.println((char)obj2.read());
            obj2.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
