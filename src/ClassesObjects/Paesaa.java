package ClassesObjects;

    import java.util.Scanner;

    class Rupees{
        int p1,p2,s,r;
        void currency(int p1,int p2) {
            this.p1=p1;
            this.p2=p2;
            s=p1+p2;
            if(s>99) {
                r=s%100;
                s=s/100;
                System.out.println("Rupees="+s+" "+"Paesaa="+r);
            }
        }
    }

    public class Paesaa {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            Rupees ob=new Rupees();
            System.out.println("Enter two paesaa:");
            int p1=sc.nextInt();
            int p2=sc.nextInt();
            ob.currency(p1,p2);
        }

    }

