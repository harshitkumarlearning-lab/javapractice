package recurtion;
import java.util.Scanner;
public class sumwith_return_type {
    public static int add (int n){
        if(n == 0) return 0 ;
        return (n+add(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = add(n);
        System.out.println(sum);
    }
}
