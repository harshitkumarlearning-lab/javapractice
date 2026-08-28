import java.util.Scanner;

public class largest_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               max = Math.max(max,arr[i][j]);
               }
            }
            System.out.println(max);
    }
}

