package advanceSorting.cycleSort;
import java.util.Scanner;
public class missingNumber {
    public static void swap(int i , int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        while(i<=n){
            if(arr[i]==i||arr[i]==n) i++;
            else{
                swap(i,arr[i],arr);
            }
        }
        for(i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
