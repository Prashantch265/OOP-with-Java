package multithreading;

class WrapperDemo {
    public static void main(String args[]) {
        Integer a = Integer.valueOf(100);
        String st = a.toString();
        System.out.println("Equivalent string is:" + st);
        System.out.println("Upper limit=" + Integer.MAX_VALUE);
        System.out.println("Lower limit=" + Integer.MIN_VALUE);

    }
}

class BoxingExample {
    public static void main(String[] args) {
        int a = 50;
        Integer a1 = new Integer(a);// boxing
        Integer a3 = a;// boxing
    }
}

class UnBoxingExample {
    public static void main(String[] args) {
        Integer i = new Integer(50);
        int a = i;// unboxing
        System.out.println(a);
    }
}