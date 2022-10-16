package ClassesObjects;

class Outer{
    // private variable of the outer class
    private int num = 175;

    // inner class
    public class Inner{
        public int getNum() {
            System.out.println("This is the getnum method of the inner class");
            return num;
        }
    }
}

public class Privatemem{

    public static void main(String args[]) {
        // Instantiating the outer class
        Outer outer = new Outer();

        // Instantiating the inner class
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.getNum());
    }
}