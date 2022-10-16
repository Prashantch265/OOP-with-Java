package multithreading;

class runThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class runThreaddemo {
    public static void main(String[] args) {
        runThread obj = new runThread();
        obj.run();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i * 5);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}