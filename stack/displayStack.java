package stack;
import java.util.Stack;
public class displayStack {
    public static void main(String[] args) {
        Stack <Integer> a = new Stack<>();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        while(!a.isEmpty()){
            System.out.println(a.pop());
        }
    }
}
