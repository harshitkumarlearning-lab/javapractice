package Binary_Tree.levelOrderTravBFS;
import java.util.Queue;
import java.util.ArrayDeque;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val = val;
    }
}
public class levelOrderTravBFS {
        public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        node g = new node(7);
        node h = new node(8);
        node i = new node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h;
        f.right = i;        
        BFS(a);
    }
    private static void BFS(node root){
        Queue<node> q = new ArrayDeque<>();
        if(root != null) q.add(root);
        while(!q.isEmpty()){
            node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }
}
