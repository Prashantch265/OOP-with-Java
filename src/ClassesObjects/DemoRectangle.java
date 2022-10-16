package ClassesObjects;


    class Rec{
        int l,b;
        void setData(int le,int br)
        {
            l=le;
            b=br;
        }
        int getArea()
        {
            return l*b;
        }
        int getPerimeter()
        {
            return 2*(l+b);
        }
    }
    public class DemoRectangle {
        public static void main(String[] args) {
            Rec r=new Rec();
            r.setData(6, 4);
            System.out.println(r.getArea());
            System.out.println(r.getPerimeter());
        }
    }


