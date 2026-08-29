package stack;
import java.util.Scanner;
import java.util.Stack;
public class Q2_removeConsecutive {
    public static String Consecutive(String str){
        Stack <Character> st = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!st.isEmpty()&& st.peek() == ch){
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Consecutive(str));
    }
}
