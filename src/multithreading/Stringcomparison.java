package multithreading;

class Stringcompare {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("hElLo");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s3.equals(s1));
        System.out.println(s1.equalsIgnoreCase(s3));
        String s4 = new String("I say hello to my friends");
        System.out.println(s3.regionMatches(true, 1, s4, 8, 2));
        System.out.println("Foobar".startsWith("bar", 3));
        System.out.println("Foobar".endsWith("bar"));
    }
}