package Binary_Tree.level_binaryTree;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val = val;
    }
}
public class level_binaryTree {
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
        int x = level(a);
        System.out.print("level : "+x);
    }
    private static void display(node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int level(node root){
        if(root == null) return 0;
        int b = level(root.left), c = level(root.right);
        return 1+Math.max(b, c);
    }
}
