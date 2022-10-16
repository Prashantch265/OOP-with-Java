package multithreading;

class Table {
    public void printvalues(int n, String threadname) {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(n * i);
                    Thread.sleep(300);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            try {
                // count++;
                System.out.println(threadname);
                Thread.sleep(300);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class Th1 extends Thread {
    Table t;

    Th1(Table t) {
        this.t = t;
        Thread.currentThread().setName("Mythread1");
    }

    public void run() {
        t.printvalues(5, Thread.currentThread().getName());
    }
}

class Th2 extends Thread {
    Table t;

    Th2(Table t) {
        this.t = t;
        Thread.currentThread().setName("Mythread2");
    }

    public void run() {
        t.printvalues(500, Thread.currentThread().getName());
    }
}

class syncrhonizeDemo {
    public static void main(String[] args) {
        Table t = new Table();
        Th1 obj = new Th1(t);
        Th2 obj1 = new Th2(t);
        obj.start();
        obj1.start();
    }
}