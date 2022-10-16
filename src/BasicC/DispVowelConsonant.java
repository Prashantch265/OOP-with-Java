package BasicC;

import java.util.Scanner;
public class DispVowelConsonant {
    public static void main(String[] args)
    {
        int i=0;
        Scanner sc=new Scanner(System.in);
        String str=new String();
        Character ch=new Character();
        System.out.println("Enter string:");
        char[] a=sc.next().toCharArray();
        while (a[i]!='\0')
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
            {
            System.out.println("Vowel "+a[i]+"\t");
            }
            else{
                System.out.println("Consonant "+a[i]+"\t");
            }
        }
    }
}
