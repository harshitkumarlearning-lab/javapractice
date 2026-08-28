package recurtion;
import java.util.Scanner;
public class traverse_char_array {
    public static void check(int i, String str){
        if(i == str.length()) return;
        System.out.print(str.charAt(i));
        check(i+1,str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        check(0,str);
    }
}
