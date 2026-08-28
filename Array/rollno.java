

import java.util.Scanner;

public class rollno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total class roll : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Enter the marks of student: ");
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Roll no of student got marks less than 35 : ");
        for(int i=0;i<=n-1;i++)
        {
            if(arr[i]<35)
            {
                System.out.print(i+1 +" ");
            }
        }
    }
}
