package Annotations;


import java.util.ArrayList;

public class SuppressWarnings {
    @java.lang.SuppressWarnings("unchecked")
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("sunday");
        list.add("monday");
        list.add("tuesday");
        for (Object o:list) {
            System.out.println(o);
        }
    }
}
