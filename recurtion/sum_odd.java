package recurtion;
import java.util.Scanner;
public class sum_odd {
    public static int sum(int a, int b) {
        if (a>b) {
            return 0;
        }
        if(a%2==0) a = a+1;
        return a+sum(a+2, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a,b));
    }
}
