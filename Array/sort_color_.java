import java.util.Scanner;

public class sort_color_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lo=0,mid=0,high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                mid++;
                lo++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }
}
