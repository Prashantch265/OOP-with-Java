package ClassesObjects;

    class Count{
        static int c=0;
        public Count(){
            c++;
        }

    }
    public class ObjectCount {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Count t1=new Count();
            Count t2=new Count();
            Count t3=new Count();
            System.out.println(Count.c);
        }

    }


