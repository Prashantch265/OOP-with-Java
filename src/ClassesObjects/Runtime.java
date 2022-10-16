package ClassesObjects;

    abstract class A
    {
        public abstract void method();
        public void run()
        {
            System.out.println("hello world from abstract class");
        }

    }
    class B extends A
    {
        public void method()
        {
            System.out.println("from java");
        }
    }
    public class Runtime {
        public static void main(String args[])
        {

            A obj=new B();//A parent class reference variable can refer to a child object.
            obj.method();


        }
    }
