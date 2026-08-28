import java.util.Scanner;

public class runningsum_leetcode1480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int n = sc.nextInt();
        int []arr = new int[n];
        int []brr = new int[n];
        for(int i = 0;i<n ;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                brr[i]=arr[i]+arr[j];
            }
        }
    }
}
