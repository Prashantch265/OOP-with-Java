package Kist.A;

class Thread1 implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 50; i++) {
                if (i % 2 == 0) {
                    java.lang.Thread.sleep(500);
                    System.out.println(i);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class Thread2 implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 50; i++) {
                if (i % 2 != 0) {
                    java.lang.Thread.sleep(700);
                    System.out.println(i);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class TwoThread{
    public static void main(String[] args){
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        Thread thread1 = new Thread(obj1);
        thread1.start();
        Thread thread2 = new Thread(obj2);
        thread2.start();
    }
}
