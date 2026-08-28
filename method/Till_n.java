//Write a method to print squares of the first n natural numbers, 
// taking n as an argument to the method.
package method;
import java.util.Scanner;
public class Till_n {
    public static void main(String[] args) {
        Natural nat = new Natural();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nat.calc(n);
    }
}

class Natural{
    void calc(int n){
        for(int i = 1; i<=n; i++){
            System.out.println(i*i);
        }
    }
}