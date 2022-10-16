package ClassesObjects;

    class AccessSpecifier {
        int a;//default access specifier
        private int b;//private access specifier
        public int c;//public access specifier
        public void setB(int b) {
            this.b=b;
        }
        public int getB()
        {
            return b;
        }
        public AccessSpecifier(int a,int b,int c)
        {
            this.a=a;
            this.b=b;
            this.c=c;
        }

    }
    class ASDemo
    {
        public static void main(String[] args)
        {
            AccessSpecifier obj=new AccessSpecifier(1,2,3);
            System.out.println(obj.a);
            obj.setB(1);
            System.out.println(obj.getB());
            System.out.println(obj.c);
        }
    }

    public class Access {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            ASDemo.main(args);
        }

    }
