package advanceSorting.MergeSort;
public class inversionCount {
    static int count = 0;
    public static void inversion(int[]a,int[]b){
        int i = 0, j = 0;
        while(i<a.length&&j<b.length){
            if(a[i]>b[j]){
                count=count+(a.length-i);
                j++;
            }
            else i++;
        }
    }
    public static void sort(int []a,int[]b,int[]arr){
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                arr[k++]=a[i++];
            }
            else{
                // count=count+(a.length-i);
                arr[k++]=b[j++];
            }
        }
        while(j<b.length) arr[k++]= b[j++];
        while(i<a.length) arr[k++]= a[i++];
    }
    public static void merge(int [] arr){
        int n = arr.length;
        int [] a = new int[n/2];
        int [] b = new int[n-n/2];
        if(n==1) return;
        for(int i = 0; i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i = 0; i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        merge(a);
        merge(b);
        inversion(a,b);
        sort(a,b,arr);
        a=null;
        b=null;
    }
    public static void main(String[] args) {
        int arr[] = {8,2,5,3,1,4};
        merge(arr);
        System.out.println(count);
    }
}
