package Revision1;
import java.util.Scanner;
public class bool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean x = a==b;
        boolean y = a!=b;
        boolean z = a>b;
        boolean w = a<b;
        System.out.println("Are numbers equal? " + x);
        System.out.println("Are numbers not equal? " + y);
        System.out.println("Is the first number greater? " + z);
        System.out.print("Is the first number less? " + w);
    }
}