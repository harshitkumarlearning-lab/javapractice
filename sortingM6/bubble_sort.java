public class bubble_sort {
    public static void main(String[] args) {
        int []arr = {1,5,3,4,2};
        int n = arr.length;
        for(int x = 1; x<n; x++){
            boolean flag = true;
            for(int i = 0; i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
