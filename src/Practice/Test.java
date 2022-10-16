package Practice;

import java.io.*;
import java.util.Scanner;

class ObjectStreamTest implements  Serializable{
    String s;
    public ObjectStreamTest(String s){
        this.s = s;
    }
    public String toString(){
        return s;
    }
}

public class Test {
    public static void main(String[] args){
//        try{
//            File f = new File("d:/Assignment", "test.txt");
//            FileInputStream obj1 = new FileInputStream(f);
//            FileWriter obj2 = new FileWriter("d:/Assignment/testcopy.txt", true);
//            int c;
//            while ((c = obj1.read()) != -1){
//                System.out.println((char)c);
//            }
//            String s = "Hello Guys Ye hum hae ye hamari car hae or ye hamari pawri ho rahi hae";
//            obj2.write(s);
//            obj1.close();
//            obj2.close();
//            FileOutputStream f1 = new FileOutputStream("d:/Assignment/ObjectStream.txt");
//            FileInputStream f2 = new FileInputStream("d:/Assignment/ObjectStream.txt");
//            ObjectOutputStream obj3 = new ObjectOutputStream(f1);
//            ObjectStreamTest obj = new ObjectStreamTest("Ye uthaale rey Baba hum kaa uthale");
//            obj3.writeObject(obj);
//            obj3.close();
//            ObjectInputStream obj4 = new ObjectInputStream(f2);
//            System.out.println((ObjectStreamTest)obj4.readObject());
//            obj4.close();
//        }catch(Exception e){
//            System.out.println(e);
//        }

//        Rectangle obj1 = new Rectangle();
//        Square obj2 = new Square();
//        obj1.get_data();
//        obj2.get_data();
//        obj1.display_area();
//        obj2.display_area();

        Pawri obj = new Pawri();
        obj.start();
    }
}

interface Shape{
    public abstract void get_data();
    public abstract void display_area();
}

class Rectangle implements Shape{
    double l,b;
    Scanner sc = new Scanner(System.in);
    public void get_data(){
        this.l = sc.nextDouble();
        this.b = sc.nextDouble();
    }

    public void display_area(){
        System.out.println("Area of Rectangle " + l*b);
    }
}

class Square implements Shape{
    double l;
    Scanner sc = new Scanner(System.in);
    public void get_data(){
        this.l = sc.nextDouble();
    }

    public void display_area(){
        System.out.println("Area of Rectangle " + l*l);
    }
}

class Pawri extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
