package recurtion;
import java.util.Scanner;
public class assignment3 {
    public static boolean ans(int n){
        if (n<=0) return false;
        if (n==1) return true;
        if (n%2!=0) return false;
        return ans(n / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ans(n));
    }
}
