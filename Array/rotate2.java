import java.util.Scanner;

public class rotate2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        swap(arr,k);
       for(int i=0;i<arr.length;i++)
       {
          System.out.print(arr[i]+" ");
       }
     }
     public static void swap(int []arr,int k)
     {
          int n = arr.length;
          k=k%n;
          reverse(arr,0,n-k-1);
          reverse(arr,n-k,n-1);
          reverse(arr,0,n-1);
     }
     public static void reverse(int []arr,int i,int j)
     {
          while(i<=j)
          {
               int temp =arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
          }
     }
}
        