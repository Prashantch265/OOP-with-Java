package Stringhandle;

public class StringFunctions {
    public static void main(String[] args){
        String s1="hello world";
        String s2="my name is prashant";
        String s3="Hello!";
        String s4="   Java   ";
        String s5="hello world";
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(8));
        System.out.println(s1.compareTo(s5));
        System.out.println(s3.concat(s2));
        System.out.println(s3.compareTo(s2));
        System.out.println(s3.compareToIgnoreCase(s2));
        System.out.println(s1.contentEquals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s4);
        System.out.println(s4.trim());
        System.out.print(s1.replace("h","m"));
        System.out.println(s1.endsWith("i"));
        char[] arr = new char[9];
        s1.getChars(1,4,arr,1);
        for (char a: arr){
            System.out.println(a);
        }
        System.out.println(s1==s5);
        System.out.println(s1.equals(s5));
    }
}
