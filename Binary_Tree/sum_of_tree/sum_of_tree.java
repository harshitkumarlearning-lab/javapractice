package Binary_Tree.sum_of_tree;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val = val;
    }
}
public class sum_of_tree {
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
        int x = sum(a);
        System.out.print(x);
    }
    private static void display(node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int sum(node root){
        if(root == null) return 0;
        int s = 0;
        s = s + root.val +sum(root.left)+sum(root.right);
        return s;
    }
}
