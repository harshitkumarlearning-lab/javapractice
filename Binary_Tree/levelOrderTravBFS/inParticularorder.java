package Binary_Tree.levelOrderTravBFS;
import java.util.LinkedList;
import java.util.Queue;
public class inParticularorder {
    public static class pair{
        node node;
        int val;
        pair(node node, int val){
            this.node = node;
            this.val = val;
        }
    }
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
        traversal(a);
    }
    private static void traversal(node root){
        int prevlvl = 0;
        Queue<pair> q = new LinkedList<>();
        if(root != null) q.add(new pair(root, 0));
        while(!q.isEmpty()){
            pair front = q.remove();
            node temp = front.node;
            int lvl = front.val;
            if(prevlvl != lvl){
                System.out.println();
                prevlvl++;
            }
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(new pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new pair(temp.right, lvl+1));
        }
    }
}
