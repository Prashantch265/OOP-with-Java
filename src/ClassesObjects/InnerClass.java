package ClassesObjects;

class Outer_Demo {
    int num=1;

    // inner class
    private class Inner_Demo {
        public void print() {
            System.out.println("This is an inner class");
        }
    }

    // Accessing he inner class from the method within
    void display_Inner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}

public class InnerClass {

    public static void main(String args[]) {
        // Instantiating the outer class
        Outer_Demo outer = new Outer_Demo();
        //outer class member
        System.out.println(outer.num);
        // Accessing the display_Inner() method.
        outer.display_Inner();
    }
}