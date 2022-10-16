package Stringhandle;

class Stringsort {
    public static void main(String[] args) {
        String s[] = { "Kamal", "Indra", "Tek", "Prashant", "Pramod", "Praveen" };
        for (int j = 0; j < s.length; j++) {
            for (int i = 0; i < s.length - j - 1; i++) {
                int comparedvalue = s[i].toLowerCase().compareTo(s[i + 1].toLowerCase());
                if (comparedvalue > 0) {
                    String temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                }
            }
        }
        for (String string : s) {
            System.out.println(string);
        }
    }
}