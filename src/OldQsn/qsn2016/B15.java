package OldQsn.qsn2016;

import java.io.File;

public class B15 {
    public static void main(String[] args){
        try{
            File obj = new File("d:/Assignment");
//            String[] list;      used for list() directory
            File[] filelist;        //used for listing files
            filelist = obj.listFiles();
            for (File a:filelist) {
                System.out.println(a);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
