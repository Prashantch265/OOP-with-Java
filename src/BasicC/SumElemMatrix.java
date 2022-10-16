package BasicC;

public class SumElemMatrix {
    public static void main(String[] args)
    {
        int[][] m= {{10,5,-3},{9,0,0},{32,20,1},{0,0,8}};
        int  i,j,s=0;
        for(i=0;i<4;i++)
        {
            for(j=0;j<3;j++)
            {
                s=s+m[i][j];
            }
        }
        System.out.println("Result="+s);
    }
}
