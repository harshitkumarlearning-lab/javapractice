package Revision1;
import java.util.Arrays;
import java.util.Scanner;
public class leetcode01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        solution sol = new solution();
        int [] brr = sol.TwoSum(arr,x);
        System.out.print(Arrays.toString(brr));
    }
    static class solution{
        public int [] TwoSum(int []arr,int x){
            int [] ans = new int[2];
            int n = arr.length;
            for(int i = 0; i<n-1; i++){
                for(int j = i+1; j<n; j++){
                    if(arr[i]+arr[j]==x){
                        ans[0]=i;
                        ans[1]=j;
                        break;
                    }
                }
            }
            return ans;
        }
    }
}
