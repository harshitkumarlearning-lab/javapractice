import java.util.Scanner;

public class score_after_flipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]arr = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<m; i++){
            if(arr[i][0]==0){
                for(int j = 0; j<n; j++){
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }  
            }
        }
        int i,j;
        for( j =1; j<n;j++){
            int noo=0;
            int noz=0;
            for(i =0; i<m; i++)
            {
                if(arr[i][j]==0) noz++;
                else noo++;
            }
            if(noo<noz){
                for(i = 0;i<m; i++)
                {
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        int score = 0,x =1;
        for( j = n-1;j>=0;j--){
            for(i = 0;i<m;i++){
                score+=(arr[i][j]*x);
            }
            x = x*2;
        }
        System.out.println(score);
    }
}
