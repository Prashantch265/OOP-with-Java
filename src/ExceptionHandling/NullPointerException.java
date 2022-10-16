package ExceptionHandling;

class N {
     void disp() {
        int[] values = null;
        for (int s : values) {
            System.out.println(s);
        }
    }
}
    public class NullPointerException {
        public static void main(String[] args) {
            N obj = new N();
            try {
                obj.disp();
            }
            catch (java.lang.NullPointerException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

