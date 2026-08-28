import java.util.Scanner;
 class leetcode_11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mx = 0;
        int max=0;
        int i = 0, j = n-1;
        while(i<=j)
        {
            if(arr[i]<=arr[j])
            {
                mx = arr[i]*(j-i);
                i++;
            }
            else{
                mx = arr[j]*(j-i);
                j--;
            }
            if(max<mx)
            {
                max = mx;
            }
        }
        System.out.print(max);
    }
}
