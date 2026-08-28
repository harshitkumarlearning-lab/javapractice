package Revision1;

import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rsdious of circle = ");
        int a = sc.nextInt();
        double result = 3.14*a*a;
        System.out.println("area of circle = " + result);
    }
}
