package Stringhandle;

public class Assignment4 {
    public static void main(String args[]) {
        String phnoarray[] = {"9841777777", "+9779867545561", "9779999999999"};
        for (String variables : phnoarray)
        {
            String tendigno=variables.substring(variables.length()-10);
            System.out.println(tendigno);
        }
    }
}
