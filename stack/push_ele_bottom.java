package stack;
import java.util.Stack;
public class push_ele_bottom {
    public static void main(String[] args) {
        Stack <Integer> a = new Stack<>();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        System.out.println(a);
        System.out.println("Element added after pushing");
        Stack <Integer> b = new Stack<>();
        while(!a.isEmpty()){
            b.push(a.pop());
        }
        a.push(50);
        while(!b.isEmpty()){
            a.push(b.pop());
        }
        System.out.println(a);
    }
}
