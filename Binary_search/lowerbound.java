package Binary_search;
import java.util.Scanner;
public class lowerbound {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr = new int[n];
    for(int i = 0 ; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    int lo = 0;
    int hi = n-1;
    int lb = n;
    while(lo<=hi){
        int mid = (hi-lo)/2+lo;
            if(arr[mid]>=x){
                lb = Math.min(mid, lb);
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        System.out.println(lb);
    } 
}
