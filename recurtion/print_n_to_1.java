package recurtion;
import java.util.Scanner;
public class print_n_to_1 {
    public static void rev(int n){
        if(n==0) return ;
        System.out.println(n);
        rev(n-1);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rev(n);
    }
}
