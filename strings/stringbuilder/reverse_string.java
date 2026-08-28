package stringbuilder;
import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for(int i = 0; i < n/2; i++){
            char ch = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(n-i-1));
            sb.setCharAt(n-1-i,ch);
        }
        System.out.println(sb);
    }
}
