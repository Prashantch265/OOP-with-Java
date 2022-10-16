package ClassesObjects;

class Point{
    double x,y;
}
public class Mypoint {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Point p1=new Point();
        Point p2=new Point();
        p1.x=2;
        p1.y=1;
        p2.x=4;
        p2.y=2;
        double d,d1,sq,sq1,s,a;
        d=p2.x-p1.x;
        d1=p2.y-p1.y;
        sq=Math.pow(d,2);
        sq1=Math.pow(d1,2);
        s=sq+sq1;
        a=Math.sqrt(s);
        System.out.println("Distance="+a);
    }

}
