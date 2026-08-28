import java.util.Scanner;

public class set_row_column_zero_m2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean [] row = new boolean[m];
        boolean [] column = new boolean[n];
        int [][]arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if(row[i]==true){
                for (int j = 0; j < n; j++) {
                    arr[i][j]=0;
                }
            }
        }
        for (int j = 0; j < m; j++) {
            if(column[j]==true){
                for (int i = 0; i < n; i++) {
                    arr[i][j]=0;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
