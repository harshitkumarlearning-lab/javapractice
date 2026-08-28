import java.util.Scanner;

public class sort_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i = 0;
        int j = n-1;
        while (i<j)
        {
            if(arr[i]==0)
            {
                i++;
            }
            if(arr[j]==1)
            {
                j--;
            }
            else if(arr[i]==1 && arr[j]==0)
            {
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}
