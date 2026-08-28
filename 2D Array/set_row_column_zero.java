//method 1 bakwas method
import java.util.Scanner;

public class set_row_column_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]arr = new int[m][n];
        int [][]brr = new int[m][n];
        for(int i = 0;i<m;i++)
        {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                brr[i][j]=arr[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(brr[i][j]==0)
                {
                    for (int j2 = 0; j2 < n; j2++) {
                        arr[i][j2]=0;
                    }
                    for(int i2 = 0; i2 < m; i2++){
                        arr[i2][j]=0;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
