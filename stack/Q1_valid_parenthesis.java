package stack;
import java.util.Scanner;
import java.util.Stack;
public class Q1_valid_parenthesis {
    public static boolean ValidParenth(String str){
        Stack <Character> st = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(st.size()==0) return false;
                if(ch == ')' && st.pop()!='('|| ch == ']'&& st.pop()!='[' || ch == '}'&& st.pop()!='{'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ValidParenth(str));
    }
}
