package stack;
import java.util.Stack;
public class copynprint {
    public static void main(String[] args) {
        Stack <Integer> a = new Stack<>();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        System.out.println(a);
        Stack <Integer> b = new Stack<>();
        while(!a.isEmpty()){
            b.push(a.pop());
        }
        System.out.println(b);
        Stack<Integer> c = new Stack<>();
        while(!b.isEmpty()){
            c.push(b.pop());
        }
        System.out.println(c);
    }
}
