package multithreading;

class nestedtry {
    public static void main(String args[]) {
        try {
            try {
                int a = 5 / 0;
                System.out.println(a);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        } catch (ArithmeticException e) {
            System.out.println(e + " there is blunder in your code");
        }
        System.out.println("hello guys");
    }
}