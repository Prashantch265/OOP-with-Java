package Filehandling;

import java.io.File;
import java.io.FilenameFilter;

public class Filelist {
    public static void main(String[] args) {
        File f1 = new File("d:/country");
        File f2 = new File("d:/Assignment");
        String[] list;
        File[] filelist;
        String[] filter;
        try {
            list = f1.list();
//            filter = f2.list("file1");
            for (String a:list){
                System.out.println(a);
            }
            filelist = f2.listFiles();
            for(File b:filelist){
                System.out.println(b);
            }
//            System.out.println(f2.renameTo(f1));
            System.out.println(f1.compareTo(f2));   //can compare filename and object
            System.out.println(f1.equals(f2));
            System.out.println(f1.toString());
            System.out.println(f2.getPath());
            System.out.println(f1.getAbsolutePath());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
