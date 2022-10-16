package Stringhandle;

class Characterextract {
    public static void main(String[] args) {
        String s4 = "I am a disco dancer.";
        char test = s4.charAt(7);
        System.out.println(test);
        char arr[] = new char[4];

        s4.getChars(2, 6, arr, 0);
        for (char c : arr) {
            System.out.println(c);
        }
        byte arr1[] = new byte[4];
        s4.getBytes(2, 6, arr1, 0);
        for (byte c : arr1) {
            System.out.println(c);
        }
         char[] ch = s4.toCharArray();
        for (char c : s4.toCharArray()) {
            System.out.print(c);
        }

        char charr[] = new char[10];
        String s1 = ("Nepal is beautiful");
       s1.getChars(0,5,charr,1);
        for(int i=0; i<charr.length; i++)
        {
            System.out.println(charr[i]);
        }

    }
}