package OldQsn.qsn2018;

import java.util.Scanner;

interface Data1{
    public abstract void getData1();
    public abstract void displayData1();
}
interface Data2{
    public abstract void getData2();
    public abstract void displayData2();
}
class Store implements Data1, Data2{
    Double SD1,SD2;
    Scanner sc = new Scanner(System.in);
    @Override
    public void getData1() {
        System.out.println("Enter the SD of Poupulation 1");
        SD1 = sc.nextDouble();
    }

    @Override
    public void displayData1() {
        System.out.println("SD of Population 1 is "+SD1);
    }

    @Override
    public void getData2() {
        System.out.println("Enter the SD of Population 2");
        SD2 = sc.nextDouble();
    }

    @Override
    public void displayData2() {
        System.out.println("SD of Population 2 is "+SD2);
    }
}
public class C17 {
    public static void main(String[] args){
        Store obj = new Store();
        obj.getData1();
        obj.getData2();
        obj.displayData1();
        obj.displayData2();
    }
}
