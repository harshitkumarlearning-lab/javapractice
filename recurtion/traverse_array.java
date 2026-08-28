package recurtion;
import java.util.Scanner;
public class traverse_array {
    public static void print(int i, int[] arr){
        if(i == arr.length) return;
        System.out.println(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        print(0,arr);
    }
}
