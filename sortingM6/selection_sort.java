import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,5,3,4,2};
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            
                for(int j = i; j < n; j++){
                    if(arr[j]<min){
                        min = arr[j];
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
