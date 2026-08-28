package conditionals;

import java.util.Scanner;

public class ternaryop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number : ");
        int n = sc.nextInt();
        System.out.println((n%2==0)?"even":"odd");
    }
}
