package Binary_search;
import java.util.Scanner;
public class mounted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int lo = 0;
        int hi = n-1;
        int pi = -1;
        while(lo<=hi){
            int mid = (hi-lo)/2+lo;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                pi = mid;
                hi = mid-1;
                lo = mid+1;
            }
            else if(arr[mid]<arr[mid+1]){
                lo = mid+1;
            }
             else if(arr[mid]<arr[mid-1]){
                hi = mid-1;
            }
        }
        System.out.println(pi);
    }
}
