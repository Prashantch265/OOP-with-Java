package Thread;

class Runthread extends Thread{
    public void run(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println(i);
            try{
                java.lang.Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }
}

public class Threadnumstart {
    public static void main(String[] args){
        Runthread obj= new Runthread();
        obj.run();
        try{
            for (int i = 0; i < 5 ; i++) {
                System.out.println();
            }
        }catch (Exception e){

        }
    }
}

