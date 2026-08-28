import java.util.Scanner;

public class set_row_column_zero_m3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean zr=false;
        boolean zc=false;
        int [][]arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        } 
        for (int i = 0; i < m; i++) {
          if(arr[i][0]==0){
                zr = true;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if(arr[0][j]==0){
                 zc=true;
                 break;
            }
        }
        for(int i = 1; i<m; i++)
        {
            for(int j = 1; j<n;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            if(arr[i][0]==0){
                for (int j = 1; j < n; j++) {
                    arr[i][j]=0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            if(arr[0][j]==0){
                for (int i = 1; i < m; i++) {
                    arr[i][j]=0;
                }
            }
        }
        if(zc==true){
            for(int j = 0; j < n; j++){
                 arr[0][j]=0;
                }
            }
         if(zr==true){
            for(int i = 0; i < m; i++){
                 arr[i][0]=0;
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
