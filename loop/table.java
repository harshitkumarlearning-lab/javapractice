package loop;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table you want : ");
        int n = sc.nextInt();
        System.out.print("Enter the range of table : ");
        int a = sc.nextInt();
        for (int i=1;i<=a;i++)
        {
             System.out.println(i*n);
        }
    }
}
