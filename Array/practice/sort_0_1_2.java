package practice;
import java.util.Scanner;
public class sort_0_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int mid = 0;
        int lo = 0;
        int hi = n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,mid,lo);
                lo++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                swap(arr,mid,hi);
                hi--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[]arr,int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
