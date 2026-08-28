package practice;
import java.util.Scanner;
public class rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        ans(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void ans(int []arr, int k){
        int l = arr.length;
        k = k % l;
        reverse(arr, 0, l - k - 1);
        reverse(arr, l - k, l - 1);
        reverse(arr, 0, l - 1);
    }
    public static void reverse(int[]arr,int i,int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
