package Binary_Tree.max_node;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val = val;
    }
}
public class max_node {
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(0);
        node c = new node(3);
        node d = new node(5);
        node e = new node(7);
        node f = new node(4);
        node g = new node(0);
        node h = new node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.right = f;
        c.left = g; c.right = h;
        display(a);
        System.out.println();
        int x = maxi(a);
        System.out.print("max node : "+x);
    }
    private static void display(node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int maxi(node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val, b = maxi(root.left), c = maxi(root.right);
        return Math.max(a,Math.max(b, c));
    }
}
