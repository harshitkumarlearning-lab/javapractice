import java.util.Scanner;

public class take_max_sorting {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,5,3,4,2};
        int n = arr.length;
        for(int i = n-1; i >= 1; i--){
            int max = Integer.MAX_VALUE;
            int idx = -1;
            
                for(int j = i; j < n; j++){
                    if(arr[j]>max){
                        max = arr[j];
                        idx = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
