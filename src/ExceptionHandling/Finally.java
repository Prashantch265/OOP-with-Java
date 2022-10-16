package ExceptionHandling;

public class Finally {
    public static void main(String[] args)
    {
        try{
            int[] values = null;
            for (int s : values) {
                System.out.println(s);
        }
    }
        catch (java.lang.NullPointerException obj){
        System.out.println(obj);
        }
        finally {
            System.out.println("haha");
        }
        System.out.println("Good");
        }
}
