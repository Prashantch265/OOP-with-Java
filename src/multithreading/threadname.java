package multithreading;

class Thrr1 extends Thread {
    public void run() {
        Thread.currentThread().setName("nirjala");
        System.out.println(Thread.currentThread().getName());
    }
}

class Threadnamedemo {
    public static void main(String args[]) {

        Thrr1 t1 = new Thrr1();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        String name = t1.getName();
        System.out.println(name);

    }
}