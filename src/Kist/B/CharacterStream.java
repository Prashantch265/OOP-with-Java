package Kist.B;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("d:/kist/file1.txt");
            String s="copy the content of file using characterstream";
            fw.write(s);
            fw.close();
            FileReader fr = new FileReader("d:/kist/file1.txt");
            int c;
            FileWriter f1 = new FileWriter("d:/kist/copy.txt");
            while ((c = fr.read()) != -1){
                f1.write((char)c);
            }
            fr.close();
            f1.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
