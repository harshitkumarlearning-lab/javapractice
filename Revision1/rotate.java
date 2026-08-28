package Revision1;
import java.util.Scanner;
public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
    //     int i = k; 
    //     int j = n-1;
    //     while(i<=j){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //     }
    //     int m = 0; 
    //     int l = n-k-1;
    //     while(m<=l){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         m++;
    //         l--;
    //     }       
    //     for(i=0;i<n/2;i++){
    //         int temp = arr[i];
    //         arr[i] = arr[n-1-i];
    //         arr[n-1-i] = temp;
    //     }
    //     for(int ele : arr){
    //         System.out.print(ele+" ");
    //     }
        k = k%n;
        reverse(arr,0,n-1-k);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for (int ele : arr) {
            System.out.print(ele +" ");
        }
    }
    public static void reverse(int [] arr, int i ,int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

