package ClassesObjects;


    class Rect{
        int l,b;
        Rect(){
            l=5;
            b=4;
            System.out.println("Creating Rectangle");
        }
    }
    public class Constructor {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Rect r=new Rect();
            System.out.println("Area is:"+ r.l*r.b);
        }
    }


