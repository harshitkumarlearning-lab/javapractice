import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]arr = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int minr = 0, maxr = m-1, minc = 0, maxc = n-1;
        while(minr<=maxr&&minc<=maxc)
        {
            for (int i = minr; i <= minr; i++) {
                for(int j = minc; j<=maxc; j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            minr++;
            if(minr>maxr||minc>maxc) break;
            for(int j = maxc; j>=maxc; j--)
            {
                for(int i = minr; i<=maxr; i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            maxc--;
            if(minr>maxr||minc>maxc) break;
            for(int i = maxr; i>=maxr; i--)
            {
                for(int j = maxc; j>=minc; j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            maxr--;
            if(minr>maxr||minc>maxc) break;
            for(int j = minc; j<=minc; j++)
            {
                for(int i = maxr; i>=minr;i--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            minc++;
        }
    }
}
