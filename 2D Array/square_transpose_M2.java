import java.util.Scanner;

public class square_transpose_M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int [][]arr = new int[m][m];
        for (int i = 0; i < m; i++) { 
            for(int j = 0; j < m; j++){
            arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
         for (int i = 0; i < m; i++) { 
            for(int j = 0; j < m; j++){
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
