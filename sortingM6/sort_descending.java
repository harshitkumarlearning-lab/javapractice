import java.util.Scanner;

public class sort_descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {3,1,2,5,4};
        int n = arr.length;
        for(int x = 0; x<n-1;x++){
            boolean flag = true;
            for(int i = 0; i<n-1-x;i++){
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
