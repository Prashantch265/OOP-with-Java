package ClassesObjects;


    class BoxDemo{
        double l,b,h;
    }
    public class Box{

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            BoxDemo b1=new BoxDemo();
            b1.l=5.5;
            b1.b=4.5;
            b1.h=3.4;
            double v=b1.l*b1.b*b1.h;
            System.out.println("Volume="+v);
        }

    }

