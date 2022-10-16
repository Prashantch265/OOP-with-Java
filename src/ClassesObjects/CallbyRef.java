package ClassesObjects;


    class Refer{
        int a,b;
        public Refer(int a,int b){
            this.a=a;
            this.b=b;
        }
        void meth(Refer ob) {
            a*=2;
            b/=2;
        }
    }
    public class CallbyRef {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Refer ob=new Refer(15,20);
            System.out.println("a & b before call"+ob.a+" "+ob.b);
            ob.meth(ob);
            System.out.println("a & b before call"+ob.a+" "+ob.b);
        }

    }


