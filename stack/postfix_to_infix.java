package stack;
import java.util.Scanner;
import java.util.Stack;
public class postfix_to_infix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<String> val = new Stack<>();
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String s = ch+"";
                val.push(s);
            }
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                char x = ch;
                String t = v1+x+v2;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
