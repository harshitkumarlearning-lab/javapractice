package method;
import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        calculator calc = new calculator();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calc.count(n);
        calc.square(n);
    }
}
class calculator{
    void count(int n){
        int count = 1;
        while(n!=0){
            n = n%10;
            count++;
        }
        System.out.println("The number of digit in a number is = " + count);
    }
    void square(int n){
        int res = n*n;
        System.out.println("The square of the given number is = " + res);
    }
}