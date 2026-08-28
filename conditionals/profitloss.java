package conditionals;
import java.util.Scanner;

public class profitloss {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("SP: ");
        int a = sc.nextInt();
        System.out.print("CP: ");
        int b = sc.nextInt();
        if (a>b) System.out.println("Profit is : "+(a-b));
        if (b>a) System.out.println("loss"+(b-a));
        if (a==b) System.out.println("No Profit, No loss");
    }
}


