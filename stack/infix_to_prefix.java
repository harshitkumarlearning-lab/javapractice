package stack;
import java.util.Scanner;
import java.util.Stack;
public class infix_to_prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String str = sc.nextLine();
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            int askii = (int)ch;
            if(askii>=48 && askii<=57) {
                String s = ""+ch;
                val.push(s);
            }
            else if(op.size()==0 || ch=='('|| op.peek()=='(') op.push(ch);
            else if(ch ==')'){
                while(op.peek()!='('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char x = op.pop();
                    String s = x+v1+v2;
                    val.push(s);
                }
                op.pop();
            }
            else{
                if(ch=='+'||ch=='-'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char x = op.pop();
                    String s = x+v1+v2;
                    val.push(s);
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*'||op.peek()=='*'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char x = op.pop();
                        String s = x+v1+v2;
                        val.push(s);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
         while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char x = op.pop();
            String s = x+v1+v2;
            val.push(s);
        }
        System.out.println(val.peek());
    }
}
