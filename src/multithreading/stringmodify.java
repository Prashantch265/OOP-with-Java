package multithreading;

class Stringmodify {
    public static void main(String args[]) {
        String s1 = new String("i am a disco dancer");
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2, 3));
        String s2 = s1.replace('a', 'c');
        System.out.println(s2);
        String s3 = s1.replaceAll("a", "b");
        System.out.println(s1);
        System.out.print(s3);
        String s4 = "apple";
        String s5 = "apple";
        System.out.println(s5.compareTo(s4));

    }
}