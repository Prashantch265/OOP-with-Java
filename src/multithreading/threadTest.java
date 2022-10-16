package multithreading;

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(5 + "X" + i + "=" + 5 * i);
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(3 + "X" + i + "=" + 3 * i);
                Thread.sleep(2000);
            } catch (Exception ex) {
                System.out.println(ex);
            }

        }
    }
}

class Demo {
    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();

        // for (int i = 1; i < 5; i++) {
        // System.out.println("Happy thread progarm");
        // try {
        // Thread.sleep(500);
        // } catch (Exception ex) {
        // System.out.println(ex);
        // }

        // }
    }
}