package ClassesObjects;

class Rectangle{
    double l,b;
}
public class Measurement {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Rectangle m = new Rectangle();
        m.l = 5.5;
        m.b = 3.6;
        double a, p;
        a = m.l * m.b;
        p = 2 * (m.l + m.b);
        System.out.println("Area=" + a + "\nPerimeter=" + p);
    }

}

