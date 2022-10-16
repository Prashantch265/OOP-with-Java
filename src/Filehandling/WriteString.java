package Filehandling;

import java.io.FileOutputStream;

public class WriteString {
    public static void main(String[] args){
        try{
            FileOutputStream f = new FileOutputStream("d:/Assignment/writestring.txt");
            String b="Write string using FileOutputStream";
            byte a[]=b.getBytes();
            f.write(a);
            f.close();
        }catch (Exception e){
          System.out.println(e);
        }
    }
}
