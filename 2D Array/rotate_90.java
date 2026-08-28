import java.util.Scanner;

public class rotate_90 {
    public static void ans(int [][]arr){
        int m = arr.length;
        for(int i = 0; i < m; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
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
        ans(arr);
        for (int i = 0; i < m; i++) {
            int a = 0, b = m-1;
            while(a<=b)
            {
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }
        System.out.println();
        ans(arr);
   }
}
