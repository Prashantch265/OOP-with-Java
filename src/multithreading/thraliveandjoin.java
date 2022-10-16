package multithreading;

class Thaljoin1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("I am thread1");
                Thread.sleep(500);
            }
        } catch (Exception e) {

        }
    }
}

class Thaljoin2 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("I am thread2");
                Thread.sleep(500);
            }
        } catch (Exception e) {

        }
    }
}

class ThreadAliveandJoin {
    public static void main(String[] args) {
        Thaljoin1 t1 = new Thaljoin1();
        Thread t2 = new Thread(new Thaljoin2(), "Thread2");
        t1.start();
        t2.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        try {
            System.out.println(t1.isAlive());
            System.out.println(t2.isAlive());
            t1.join();
            t2.join();
            System.out.println(t1.getPriority());
            System.out.println(t1.isAlive());
            System.out.println(t2.isAlive());

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}