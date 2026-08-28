package advanceSorting.quickSort;
public class randamizePivot {
     public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static int replace(int [] arr, int lo, int hi){
        int count = 0;
        int mid = (lo+hi)/2;
        int pivot = arr[mid];
        int pidx=mid;
        for(int i = lo; i<=hi;i++){
            if(i==mid) continue;
            if(pivot>=arr[i]){
                count++;
            }
        }
            int orgCount=lo+count;
            int temp = arr[pidx];
            arr[pidx] = arr[orgCount];
            arr[orgCount] = temp;
            int i = lo;
            int j = hi;
            while(i<orgCount&&j>orgCount){
                if(arr[i]<=pivot) i++;
                else if (arr[j]>pivot) j--;
                else if(arr[i]>pivot&&arr[j]<=pivot){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            return orgCount;
    }
    public static void sort(int [] arr, int lo, int hi){
        if(lo>=hi) return;
        int std = replace(arr,lo,hi);
        sort(arr,lo,std-1);
        sort(arr,std+1,hi);
    }
    public static void main(String[] args) {
        int arr[] = {3,3,3,3,4,3,3,3,3};
        int n = arr.length;
        sort(arr,0,n-1);
        print(arr);
    }
}
