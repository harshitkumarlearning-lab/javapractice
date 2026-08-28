import java.util.Scanner;

public class inputareaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The radius of circle is : ");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.println("The area of circle is : " +a);
    }
}
