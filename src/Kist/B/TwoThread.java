package Kist.B;

class Thread1 extends Thread{
    public void run(){
    try{
        for (int i = 1; i <=100 ; i++) {
            java.lang.Thread.sleep(1000);
            System.out.println(i);
        }
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
class Thread2 extends Thread{
    public void run(){
     try{
         for (int i = 100; i >0 ; i--) {
             java.lang.Thread.sleep(1500);
             System.out.println(i);
         }
     }catch (Exception e){
         System.out.println(e);
     }
    }
}
public class TwoThread extends Thread {
    public static void main(String[] args){
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        obj1.start();
        obj2.start();
    }
}
