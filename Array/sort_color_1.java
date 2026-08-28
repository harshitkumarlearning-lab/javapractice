import java.util.Scanner;

public class sort_color_1 {
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
               swap(arr,mid,lo);
                mid++;
                lo++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
               swap(arr,mid,high);
                high--;
            }
        }
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }
    public static void swap(int[]arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
