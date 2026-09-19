package Queue;
import java.util.*; //use to add all the library.
// import java.util.ArrayDeque;
// import java.util.LinkedList;
// import java.util.Queue;
public class basicSTL {
    public static void main(String[] args) {
        // How to use stl of queue-> for this we have two type 
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        // to  add queue like we do in [stack->st.push()] here we have (add) [like q.add(val)].
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        System.out.println(q);
        //To remove the element from the queue we use [remove] or [poll].
        q.remove();//use case of remove.
        q.poll();// use case of poll.
        System.out.println(q);
        q.add(4);
        q.add(5);
        System.out.println(q);
        // to find the peek of any element we use [peek] or [element].
        System.out.println(q.element());//element case.
        q.add(6);
        System.out.println(q);
        System.out.println(q.peek());
        // to find the size of queue we use [size] 
        System.out.println(q.size());
        //to check wether the element is empty we use [isEmpty()].
        System.out.println(q.isEmpty()); 
    }
}
