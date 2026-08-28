package stack;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
        Stack <Integer> a = new Stack<>();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        Stack <Integer> b = new Stack<>();
        while(!a.isEmpty()){
            b.push(a.pop());
        }
        System.out.println(b);
    }
}
