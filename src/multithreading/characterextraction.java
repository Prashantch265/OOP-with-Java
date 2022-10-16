package multithreading;

class Charextract {
    public static void main(String[] args) {
        String s1 = "hello world";
        // System.out.println(s1.charAt(2));
        char arr[] = new char[5];
        s1.getChars(2, 7, arr, 0);
        for (char c : arr) {
            System.out.println(c);
        }
        char[] arr2 = s1.toCharArray();
        for (char c : arr2) {
            System.out.println(c);


            String s3 = "Nepal";
            String s4 = "nepal";
            System.out.println(s3.equals(s4));
        }

    }
}
