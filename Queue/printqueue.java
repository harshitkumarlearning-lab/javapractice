package Queue;
import java.util.*;
public class printqueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> st = new LinkedList<>();
        st.add(sc.nextInt());
        st.add(sc.nextInt());
        st.add(sc.nextInt());
        Queue<Integer> d = new LinkedList<>();
        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            d.add(st.remove());
        }
        System.out.println();
        while(!d.isEmpty()){
            System.out.print(d.peek()+" ");
            st.add(d.poll());
        }
    }
}
