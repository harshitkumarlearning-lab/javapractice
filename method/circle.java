package method;
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        area ar = new area();
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double res = ar.calc(r);
        System.out.print("The area of circle is = " + res);
    }
}
class area{
    double calc(int a){
        double res;
        res = 3.14*a*a;
        return res;
    }
}