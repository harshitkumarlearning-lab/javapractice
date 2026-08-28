package conditionals;

import java.util.Scanner;

public class greatestofthem {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ist number is : ");
    int a = sc.nextInt();
    System.out.print("2nd number is : ");
    int b = sc.nextInt();
    System.out.print("3rd number is : ");
    int c = sc.nextInt();
    if (a>=b && a>=c)
        System.out.println(a+": is the greatest");
    else if (b>=a && b>=c)
        System.out.println(b+": is the greatest");
    else 
        System.out.println(c+": is the greatest");
    }
}