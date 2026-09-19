package stack;
import java.util.Scanner;
import java.util.Stack;
public class infix {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) num.push(ch-48);
            else if(op.size()==0||ch =='('|| op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    int v2 = num.pop();
                    int v1 = num.pop();
                    if(op.peek() == '+') num.push(v1+v2);
                    if(op.peek() == '-') num.push(v1-v2);
                    if(op.peek() == '*') num.push(v1*v2);
                    if(op.peek() == '/') num.push(v1/v2);
                    op.pop(); 
                }
                op.pop();
            }
            else{
                if(ch=='+'||ch=='-'){
                    int v2 = num.pop();
                    int v1 = num.pop();
                    if(op.peek() == '+') num.push(v1+v2);
                    if(op.peek() == '-') num.push(v1-v2);
                    if(op.peek() == '*') num.push(v1*v2);
                    if(op.peek() == '/') num.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*'|| ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        int v2 = num.pop();
                        int v1 = num.pop();
                        if(op.peek() == '*') num.push(v1*v2);
                        if(op.peek() == '/') num.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(num.size()>1){
            int v2 = num.pop();
            int v1 = num.pop();
            if(op.peek() == '+') num.push(v1+v2);
            if(op.peek() == '-') num.push(v1-v2);
            if(op.peek() == '*') num.push(v1*v2);
            if(op.peek() == '/') num.push(v1/v2);
            op.pop();
        }
        System.out.println(num.peek());
    }
}