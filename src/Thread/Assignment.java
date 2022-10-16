package Thread;

class ThreadA implements Runnable{
    @Override
    public void run() {
        try {
            java.lang.Thread.sleep(500);
            for (int i = 1; i <= 50; i++) {
                if (i % 2 == 0) {
                    System.out.print("Even ");
                    System.out.println(i);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class ThreadB implements Runnable{
    @Override
    public void run() {
        try{
            java.lang.Thread.sleep(1000);
            for (int j = 100; j <= 200 ; j++) {
                if (j%2!=0){
                    System.out.print("Odd ");
                    System.out.println(j);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Assignment {
    public static void main(String[] args){
        ThreadA obj = new ThreadA();
        ThreadB obj1 = new ThreadB();
        obj.run();
        obj1.run();
    }
}
