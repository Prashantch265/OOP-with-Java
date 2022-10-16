package BasicC;

public class Armstrong {
    public static void main(String[] args)
    {
        int a,n,i,r,s;
        for(i=1;i<=1000;i++)
        {
            n=i;
            a=i;
            s=0;
            while(n!=0)
            {
                r=n%10;
                s=s+(r*r*r);
                n=n/10;
            }
            if(s==a)
            {
                System.out.println(a);
            }
        }
    }
}
