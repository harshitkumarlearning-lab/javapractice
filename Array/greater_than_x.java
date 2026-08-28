import java.util.Scanner;

public class greater_than_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int res = count(arr,x);
        System.out.println("\ntotal count is "+ res);
    }
    public static int count(int arr[],int x) {
        int count=0;
        for(int num : arr)
        {
            if (num>x)
            {
                System.out.print(num + " ");
                count ++;
            }
        }
        return count;
    }
    }

