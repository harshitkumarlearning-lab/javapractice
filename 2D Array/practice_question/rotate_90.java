package practice_question;
import java.util.Scanner;
public class rotate_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]arr = new int[m][n];
        for(int i = 0; i<m;i++){
            for(int j = 0; j < n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i<m; i++){
            for (int j = 0; j < n; j++) {
                arr[i][j]=arr[j][i];
            }
        }
        for (int i = 0; i < m; i++) {
            int a = 0;
            int j=n-1;
            while(a<=j){
                int temp = arr[i][a];
                arr[i][a]=arr[i][j];
                arr[i][j]=temp;
                a++;
                j--;
            }
        }
        for (int [] ele : arr) {
            for(int x :  ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
