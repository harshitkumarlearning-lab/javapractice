import java.util.Scanner;
public class inputsquare {
    public static void main(String[] args) {
        System.out.printf("The square of : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*n);
    }
}
