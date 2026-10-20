package Collage_Class_Work;
import java.util.Scanner;
public class merge_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []arr = new int[n];
        int []brr = new int[m];
        int []crr = new int[m+n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j<m; j++){
            brr[j] = sc.nextInt();
        }
        int i = n-1;
        int j = m-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(arr[i]>=brr[j]){
                crr[k] = arr[i];
                i--;
                k--;
            }
            else {
                crr[k]=brr[j];
                j--;
                k--;
            }
        }
        if(i==-1){
            while(j>=0){
                crr[k] = brr[j];
                j--;
                k--;
            }
        }
        if(j==-1){
            while(i>=0){
                crr[k] = arr[i];
                i--;
                k--;
            }
        }
        for (int k1 = 0; k1 < crr.length; k1++) {
            System.out.print(crr[k1]+" ");
        }
    }
}
