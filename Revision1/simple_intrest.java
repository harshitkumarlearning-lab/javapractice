package Revision1;
import java.util.Scanner;
public class simple_intrest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount = ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate = ");
        double r = sc.nextDouble();
        System.out.print("Enter the time = ");
        double t = sc.nextDouble();
        double SI;
        SI = (p*r*t)/100;
        System.out.println("The principle intrest is = " + SI);
    }
}