package recurtion;
import java.util.Scanner;
public class skip_char {
    public static void check(int i, String str,String ans){
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }
        if(str.charAt(i)!='a') ans = ans+str.charAt(i);
        check(i+1,str,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        check(0,str,"");
    }
}
