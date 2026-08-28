package recurtion;
import java.util.Scanner;
public class a_raise_pow_b {
    // public static int pow(int a,int b){
    //     if (b == 0) return 1;
    //     return a*pow(a,b-1);//Here time complexity becomes tc= [0(n)]
    // }
    public static int pow(int a,int b){
        if (b == 0) return 1;
        int ans = pow(a,b/2);
        if (b%2==0) return ans*ans;
        else return ans* ans *a;// time complexity pf this code is TC=[0(log b)].
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==0&&b==0){
            System.out.println("invalid");
        }
        else{
            System.out.println(pow(a,b));
        }
    }
}
