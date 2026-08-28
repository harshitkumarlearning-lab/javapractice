package recurtion;
import java.util.Scanner;
public class sum {
    public static void add(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        add(n-1,sum+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        add(n,sum);
    }
}
