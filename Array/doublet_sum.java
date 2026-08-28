import java.util.Scanner;

public class doublet_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int ans[]= sum(arr,x);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] sum(int []arr,int x)
    {
        int []ans = new int[2];
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==x)
                {
                    ans[0]=arr[i];
                    ans[1]=arr[j];
                    break;
                }
            }
        }
        return ans;
    }
}
