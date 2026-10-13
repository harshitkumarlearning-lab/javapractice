package Queue;
import java.util.*;
public class reverseKthQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        Stack<Integer>st = new Stack<>();
        System.out.print("Enter size to reverse: ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i = 0; i<q.size()-n; i++){
            int x = q.remove();
            q.add(x);
        }
        System.out.println(q);
    }
}
