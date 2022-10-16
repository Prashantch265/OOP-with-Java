package multithreading;

class Count {
    int count = 0;

    public void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class T1 extends Thread {
    Count c;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.incrementCount();
            try {

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public T1(Count count) {
        this.c = count;
    }
}

class T2 extends Thread {
    Count c;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.incrementCount();
            try {

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public T2(Count count) {
        this.c = count;
    }
}

class Demo123 {
    public static void main(String args[]) {
        Count obj = new Count();
        T1 t1 = new T1(obj);
        T2 t2 = new T2(obj);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(obj.getCount());
    }
}