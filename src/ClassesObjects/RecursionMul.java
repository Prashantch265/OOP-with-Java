package ClassesObjects;

    class RecursionDemo{
        int mul(int x,int n) {
            if(n==0) {
                return 0;
            }
            else if(n==1) {
                return x;
            }
            else {
                int multiplication=x+mul(x,n-1);
                return multiplication;
            }
        }
    }
    public class RecursionMul {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            RecursionDemo obj=new RecursionDemo();
            System.out.println("Multiplication of 3 & 5 "+obj.mul(5,3));
        }

    }
