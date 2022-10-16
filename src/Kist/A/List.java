package Kist.A;

import java.io.File;
import java.io.FilenameFilter;

public class List {
    public static void main(String[] args) {
        try {
            File f = new File("d:/Assignment");
            FilenameFilter fa = new FilenameFilter() {
                @Override
                public boolean accept(File f, String name) {
                    return name.endsWith(".txt");
                }
            };
            File[] list = f.listFiles(fa);
            for (File a:list) {
                System.out.println(a);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

