package ClassesObjects;

    class Value{
        void meth(int a,int b) {
            a*=2;
            b/=2;
            System.out.println("a & b after call"+a+" "+b);
        }
    }
    public class CallByValue {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Value ob=new Value();
            int a=15,b=20;
            System.out.println("a & b before call"+a+" "+b);
            ob.meth(a,b);

        }

    }


