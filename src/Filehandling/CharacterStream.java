package Filehandling;

import java.io.*;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;

public class CharacterStream {
    public static void main(String[] args) {
        try {
            File f = new File("d:/Assignment", "CharacterStream.txt");
            FileWriter obj1 = new FileWriter(f);
            String s = "CharacterStream writes string into a file";
            obj1.write(s);
            obj1.close();
            FileReader obj2 = new FileReader(f);
            int c;
            while ((c = obj2.read()) != -1){
                System.out.print((char)c);
            }
            obj2.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
