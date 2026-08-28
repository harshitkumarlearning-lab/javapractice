import java.util.Scanner;

public class search_2Dmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]arr = new int[m][n];
        for(int i = 0; i<m;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int z=0;
        System.out.println("enter element to check");
        int x = sc.nextInt();
        for(int i = 0,j=0;i<=j;i++,j++){
            if(arr[i][j]==x){
                z=1;
            }
            if(j==n) break;
            if(i==m) break;
        }
        if(z==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
