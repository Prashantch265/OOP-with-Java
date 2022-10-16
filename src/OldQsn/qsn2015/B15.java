package OldQsn.qsn2015;

import java.util.Scanner;

interface num{
    int add(int x, int y);
    int diff(int x, int y);
}

class Operation implements num{
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int diff(int x, int y) {
        return x - y;
    }
}
public class B15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Operation obj = new Operation();
        System.out.println("Sum = "+obj.add(sc.nextInt(),sc.nextInt()));
        System.out.println("Difference = "+obj.diff(sc.nextInt(),sc.nextInt()));
    }
}
