package Binary_search;
import java.util.Scanner;
public class firstandlastposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        int [] ans = new int[2];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int lo = 0;
        int hi = n-1;
        int fp = -1;
        while(lo<=hi){
            int mid = (hi-lo)/2+lo;
            if(arr[mid]==x){
                if(mid>0 && arr[mid]==arr[mid-1]){
                    hi = mid-1;
                }
                else{
                    fp = mid;
                    break;
                }
            }
            else if(arr[mid]>x) hi = mid-1;
            else if(arr[mid]<x) lo = mid+1;
        }
         lo = 0;
         hi = n-1;
         int lp = -1;
        while(lo<=hi){
            int mid = (hi-lo)/2+lo;
            if(arr[mid]==x){
                if(mid+1<n && arr[mid]==arr[mid+1]){
                    lo = mid+1;
                }
                else{
                    lp = mid;
                    break;
                }
            }
            else if(arr[mid]>x) hi = mid-1;
            else if(arr[mid]<x) lo = mid+1;
        }
        ans[0]=fp;ans[1]=lp;
        for(int i = 0; i<2; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
