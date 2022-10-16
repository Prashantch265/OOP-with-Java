package multithreading;

class Runnablethread implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
class RuannableThreadDemo {
    public static void main(String[] args) {

        Thread obj = new Thread(new Runnablethread(), "Demo thread");
        obj.start();
    }
}