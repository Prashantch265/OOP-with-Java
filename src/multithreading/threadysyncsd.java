package multithreading;

class Multiple {
    // synchronized public void mulVal(int n) {
    // for (int i = 1; i <= 5; i++) {
    // System.out.println(n * i);
    // try {
    // Thread.sleep(500);
    // } catch (Exception e) {
    // System.out.println(e);
    // }
    // }
    // }
    public void mulVal(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class TSsd1 extends Thread {
    Multiple m;

    TSsd1(Multiple m) {
        this.m = m;
    }

    public void run() {
        m.mulVal(5);
    }
}

class TSsd2 extends Thread {
    Multiple m;

    TSsd2(Multiple m) {
        this.m = m;
    }

    public void run() {
        m.mulVal(10);
    }
}

class Threadsyncsd {
    public static void main(String args[]) {
        Multiple m = new Multiple();
        TSsd1 t1 = new TSsd1(m);
        TSsd2 t2 = new TSsd2(m);
        try {
            t1.start();
            t2.start();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}