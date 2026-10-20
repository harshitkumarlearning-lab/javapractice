package Binary_Tree.size_binaryTree;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val = val;
    }
}
public class size_binaryTree {
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
        int x = size(a);
        System.out.print("size: "+x);
    }
    private static void display(node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int size(node root){
        if(root == null) return 0;
        int s = 0;
        return 1 +size(root.left)+size(root.right);
    }
}
