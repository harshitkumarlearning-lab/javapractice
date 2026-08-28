public class sorted_or_not {
     public static void main(String[] args) {
        int []arr={1,2,4,5};
        boolean flag = true;
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                flag = false;
            }
        }
        if(flag == true){
            System.out.print("sorted");
        }
        else{
            System.out.print("unsorted");
        }
    }
}
