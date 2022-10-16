package BasicC;

public class StringPattern {
    public static void main(String[] args)
    {
        int i,j,k;
        char[] a={'N','E','P','A','L'};
        for(i=0;i<5;i++)
        {
            k=0;
            for(j=0;j>i;j++)
            {
                System.out.print(a[k]);
                k++;
            }
            System.out.println();
        }
    }
}
