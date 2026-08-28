import java.util.Scanner;

public class leetcode_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = n-1 ;i >= 0; i--)
        {
            max = Math.max(max, arr[i]);
        }
        int k =0;
        for(int i = 0; i < n ;i++)
        {
            if(max ==arr[i])
            {
                k = i;
                break;
            }
        }
        int mx =0;
        int p = 1;
        for(int i = 0; i < n-k; i++)
        {
            arr[i] = arr[i+k];
             p = arr[i]*i;
             if(mx<p)
             {
                mx = p;
             }
        }
        System.out.println(mx);
    }
}
