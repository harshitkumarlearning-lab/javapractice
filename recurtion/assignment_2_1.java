package recurtion;
import java.util.Scanner;
public class assignment_2_1{
        public static void print(int i, int[] arr){
        if(i == arr.length) return;
        print(i+1,arr);
        System.out.println(arr[i]+" ");
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
