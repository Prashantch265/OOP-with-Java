package Stringhandle;

class Stringcompare {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = "hElLo";
         System.out.println(s1 == s2);
         System.out.println(s1 == s3);
         System.out.println(s1 == s4);
         System.out.println(s1.equals(s2));
         System.out.println(s1.equals(s3));
         System.out.println(s1.equals(s4));
         System.out.println(s1.equalsIgnoreCase(s4));
         System.out.println("Foobar".startsWith("Foo"));
         System.out.println("Foobar".startsWith("bar", 3));
         System.out.println("Foobar".endsWith("r"));
         System.out.println("apple".compareTo("apple"));
        String s5 = "he likes to go disco";
        String s6 = "I am a disco dancer";
        System.out.println(s5.regionMatches(15, s6, 7, 5));
        String test = " hello java hello   ";
        String trimmedtest = test.trim();
        System.out.println(trimmedtest);
        String replacedstring = test.replace("ell", "wow");
        System.out.println(replacedstring);
        String testsubstr = test.substring(4);
        System.out.println(testsubstr);
        String testsubstr1 = test.substring(4, 8);
        System.out.println(testsubstr1);
    }
}