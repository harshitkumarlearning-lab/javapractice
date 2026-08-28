package advanceSorting.quickSort;
import java.util.Scanner;
public class kthLargestEle {
    public static void printb(int[] arr,int pIdx) {
        System.out.println(arr[pIdx]);
    }

    public static int replace(int[] arr, int lo, int hi) {
        int value = arr[lo];
        int count = 0;

        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i]<= value) {
                count++;
            }
        }
        int pivotIdx = lo+ count;
        int temp = arr[lo];
        arr[lo] = arr[pivotIdx];
        arr[pivotIdx] = temp;
        int i = lo;
        int j = hi;

        while (i < pivotIdx && j > pivotIdx) {
            if (arr[i] <= value) {
                i++;
            }
            else if (arr[j] > value ) {
                j--;
            }
            else if (arr[i] > value && arr[j] <= value) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return pivotIdx;
    }
    public static void quick(int[] arr, int lo, int hi,int k) {
        int n = arr.length-k;
        if(lo>hi) return;
        if(lo==hi) {
            System.out.println(arr[lo]);
            return;
        }
        int pIdx = replace(arr, lo, hi);
        if(n==pIdx){
            System.out.println(arr[pIdx]);
            return;
        }
        if(n<pIdx){
            quick(arr,lo,pIdx-1,k);
        }
        else{
            quick(arr,pIdx+1,hi,k);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,3,3,3,4,3,3,3,3};
        int n = arr.length;
        int k = sc.nextInt();
        quick(arr, 0, n - 1,k);
    }
}
