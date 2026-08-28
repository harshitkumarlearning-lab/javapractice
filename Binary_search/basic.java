package Binary_search;
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int x = sc.nextInt();
        int lo = 0;
        int hi = n-1;
        boolean flag = false;
        while(lo<=hi){
             int mid = (lo+hi)/2;
            if(arr[mid]<x){
                lo=mid+1;
            }
            else if (arr[mid]>x){
                hi = mid - 1;
            }
            else if (arr[mid]==x){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.print("got the target element ");
        }
    }
}
