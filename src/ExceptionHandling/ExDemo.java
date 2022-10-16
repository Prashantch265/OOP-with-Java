package ExceptionHandling;

public class ExDemo {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            a[2] = 3;
            System.out.println(a[2]);
        }catch (java.lang.ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.toString());
        }
    }
}