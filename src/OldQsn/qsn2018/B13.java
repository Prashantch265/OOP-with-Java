package OldQsn.qsn2018;

import java.util.Scanner;

abstract class Fmachine{
    public abstract void getdata();
    public abstract void putdata();
    }

    class Airplane extends Fmachine{
    String code, name, capaity;
        Scanner sc = new Scanner(System.in);
        @Override
        public void getdata() {
            System.out.println("Enter code");
            code = sc.next();
            System.out.println("Enter name");
            name = sc.next();
            System.out.println("Enter capacity");
            capaity = sc.next();
        }

        @Override
        public void putdata() {
            System.out.println("Code = "+code);
            System.out.println("Name = "+name);
            System.out.println("Capacity = "+capaity);
        }
    }
public class B13 {
    public static void main(String[] args){
        Airplane obj1 = new Airplane();
        obj1.getdata();
        obj1.putdata();
    }
}
