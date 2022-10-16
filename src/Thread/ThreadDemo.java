package Thread;

class Thread1 extends Thread{
    public void run() {
        String[] season = {"Summer", "Rainy", "Winter", "Spring"};
            for (int i = 0; i < season.length; i++) {
                try {
                    java.lang.Thread.sleep(1000);
                System.out.println(season[i]);
            }catch (Exception e){
                    System.out.println(e);
                }
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        String[] animal={"Cat","Lion","Rhino","Dog"};
        try{
            java.lang.Thread.sleep(500);
            for (int i = 0; i < animal.length ; i++) {
                System.out.println(animal[i]);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args){
        Thread1 obj1=new Thread1();
        Thread2 obj2=new Thread2();
        try{
            obj1.run();
            obj1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        obj2.run();
    }
}
