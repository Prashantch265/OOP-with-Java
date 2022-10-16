package OldQsn.qsn2015;

class Thread implements Runnable{
    @Override
    public void run() {
        try{
            for (int i = 1; i <=20 ; i++) {
                java.lang.Thread.sleep(2000);
                System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class B12 {
    public static void main(String[] args){
        Thread obj = new Thread();
        obj.run();
    }
}
