package Binary_Tree.min_node;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val = val;
    }
}
public class min_node {
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(41);
        node c = new node(3);
        node d = new node(2);
        node e = new node(6);
        node f = new node(20);
        node g = new node(10);
        node h = new node(5);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.right = f;
        c.left = g; c.right = h;
        display(a);
        System.out.println();
        int x = mini(a);
        System.out.print("min node : "+x);
    }
    private static void display(node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int mini(node root){
        if(root == null) return Integer.MAX_VALUE;
        int a = root.val, b = mini(root.left), c = mini(root.right);
        return Math.min(a,Math.min(b, c));
    }
}
