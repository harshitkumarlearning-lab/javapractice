import java.util.Scanner;

public class rotate1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%n;
        int l=arr.length;
        int i;
        int [] brr=new int [l];
        for(i=0;i<k;i++)
        {
            brr[i]=arr[n-k+i];
        }
        for(int j=0;j<n-k;j++)
        {
            brr[i+j]=arr[j];
        }
        for(int num:brr)
        {
            System.out.print(num+" ");
        }
    }
}
