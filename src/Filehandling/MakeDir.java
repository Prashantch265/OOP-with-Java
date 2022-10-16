package Filehandling;

import java.io.File;
import java.util.*;

public class MakeDir {
    public static void main(String[] args){
        File f = new File("d:/myfile","newdir");
        if(!f.exists()){
            f.mkdir();      //creates directory
        }
        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.getParentFile());
        System.out.println(f.canRead());    //returns boolean value either true or false
        System.out.println(f.canWrite());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
    }
}
