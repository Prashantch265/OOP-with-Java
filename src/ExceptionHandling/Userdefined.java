package ExceptionHandling;

import java.util.Scanner;

class VotingAge {
    void validate(int age) throws PrashantException {
        if (age < 18) {
            throw new PrashantException("not valid");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}

public class Userdefined {
    public static void main(String[] args){
        try{
            System.out.println("Enter the age");
            Scanner sc = new Scanner(System.in);
            VotingAge obj = new VotingAge();
            obj.validate(sc.nextInt());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
