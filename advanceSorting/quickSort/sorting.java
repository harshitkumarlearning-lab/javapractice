package advanceSorting.quickSort;

public class sorting {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static int replace(int[] arr, int lo, int hi) {
        int value = arr[lo];
        int count = 0;

        // 1. Count elements strictly smaller than pivot in current range
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= value) {
                count++;
            }
        }
        // 2. Pivot's actual position in the subarray
        int pivotIdx = lo+ count;

        // Swap pivot (arr[lo]) into its correct position
        int temp = arr[lo];
        arr[lo] = arr[pivotIdx];
        arr[pivotIdx] = temp;

        // 3. Rearrange elements around pivotIdx
        int i = lo;
        int j = hi;

        while (i < pivotIdx && j > pivotIdx) {
            // Find an element on the left greater than pivot
            if (arr[i] <= value) {
                i++;
            }
            // Find an element on the right smaller than pivot
            else if (arr[j] > value ) {
                j--;
            }
            // Swap them if pointers haven't crossed pivotIdx
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

    public static void quick(int[] arr, int lo, int hi) {
        if (lo >= hi) return; // Base case

        int pIdx = replace(arr, lo, hi);

        quick(arr, lo, pIdx - 1);
        quick(arr, pIdx + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3,3,4,3,3,3,3};
        int n = arr.length;

        quick(arr, 0, n - 1);
        print(arr);
    }
}