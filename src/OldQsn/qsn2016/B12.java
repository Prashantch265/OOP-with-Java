package OldQsn.qsn2016;



class ThreadA implements Runnable{
    @Override
    public void run() {
        for (int i = 50; i <= 100 ; i++) {
                if(i%2==0){
                    System.out.println("Even= "+i);
                }
        }
    }
}
class ThreadB implements Runnable{
    @Override
    public void run() {
        for (int i = 100; i <= 200 ; i++) {
            if (i%2!=0){
                System.out.println("Odd= "+i);
            }
        }
    }
}
public class B12 {
    public static void main(String[] args){
        ThreadA obj1 = new ThreadA();
        ThreadB obj2 = new ThreadB();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}
