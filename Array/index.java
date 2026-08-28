import java.util.Scanner;
public class index {
//      public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n = sc.nextInt();
//         int []arr = new int[n];
//         for (int i=0;i<n;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         int c = sc.nextInt();
//         boolean flag = false;
//         int z = -1;
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]==c)
//             {
//                 z=i;
//                flag=true;
//                break;
//             }
//         }
//         if(flag==true)
//         {
//             System.out.print(z);
//         }
//         else
//         {
//             System.out.print(z);
//         }
//     }
// }



public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int x = sc.nextInt();
    int res = sum (arr,x);
    if(res==-1)
    {
        System.out.println(-1);
    }
    else
    {
        System.out.println(res);
    }
    }
public static int sum(int arr[],int x)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==x)
        {
            return i;
        }
    }
    return -1;
}
}