package dipesh;

class Stringhandle {
    public static void main(String[] args) {
        String s1 = "Nepal";
        String s2 = "Nepal";

        System.out.println("s1==s2");
        String s3 = new String("Nepal");
        System.out.println(s3 == s1);
        System.out.println(s3.equals(s1));
        String s4 = new String();
        System.out.println(s4);
        char charr[] = { 'a', 'p', 'p', 'l', 'e' };
        String s5 = new String(charr);
        System.out.println(s5);
        char[] charr1 = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String s6 = new String(charr1, 2, 3);
        String s7 = new String(s6);
        System.out.println(s6);
        System.out.println(s7);
        byte[] barr = { 65, 66, 67, 68, 69 };
        String s8 = new String(barr);
        System.out.println(s8);
        System.out.println("Nepali".length());
        System.out.println("abc" + 2 + 2);
        s8.concat("ghi");
        System.out.println(s8);
        String s9 = s8.concat("ghi");
        System.out.println(s9);
        System.out.println(s9.charAt(2));

    }
}
