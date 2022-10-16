package OldQsn.qsn2016;

import java.util.Scanner;

interface Calculate{
    public abstract int add(int x, int y);
    public abstract int diff(int x,int y);
}

class Operation implements Calculate{
    @Override
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    @Override
    public int diff(int x, int y) {
        int diff = x - y;
        return diff;
    }
}
public class B13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Operation obj = new Operation();
        System.out.println(obj.add(sc.nextInt(),sc.nextInt()));
        System.out.println(obj.diff(sc.nextInt(),sc.nextInt()));
    }
}
