package stack;
import java.util.Stack;
public class recursive {
    public static void recur(Stack<Integer> a){
        if(a.isEmpty()) return ;
        int top = a.pop();
        //System.out.print(top+" ");
        recur(a);
        System.out.print(top+" ");
        a.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> a = new Stack<>();
        a.push(50);
        a.push(40);
        a.push(30);
        a.push(20);
        recur(a);
    }
}
