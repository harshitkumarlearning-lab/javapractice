package loop;

import java.util.Scanner;

public class add_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
