package Thread;

//class RunnableDemo implements Runnable {
//    private Thread t;
//    private String threadName;
//
//    RunnableDemo( String name) {
//        threadName = name;
//        System.out.println("Creating " +  threadName );
//    }
//
//    public void run() {
//        System.out.println("Running " +  threadName );
//        try {
//            for(int i = 4; i > 0; i--) {
//                System.out.println("Thread: " + threadName + ", " + i);
//
//                java.lang.Thread.sleep(50);
//            }
//        }catch (InterruptedException e) {
//            System.out.println("Thread " +  threadName + " interrupted.");
//        }
//        System.out.println("Thread " +  threadName + " exiting.");
//    }
//
//    public void start () {
//        System.out.println("Starting " +  threadName );
//        if (t == null) {
//            t = new Thread ();
//            t.start ();
//        }
//    }
//}

class RunnableDemo implements Runnable{
    String tname;

    void setname(String tname){
        this.tname = tname;
        System.out.println("Created" + tname);
    }
    public void run(){
        System.out.println("Running" + tname);
        for (int i = 0; i<10; i++){
            try{
                java.lang.Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("Exiting" + tname);
    }
}

public class RunnableAssignment {

    public static void main(String args[]) {
        RunnableDemo obj = new RunnableDemo();
        obj.setname("thread-1");
        java.lang.Thread t = new java.lang.Thread(obj);
        t.start();
    }
}