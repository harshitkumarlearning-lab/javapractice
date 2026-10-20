package Binary_Tree.product_of_nonZero;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val = val;
    }
}
public class product_of_nonZero {
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
        int x = product(a);
        System.out.print("product : "+x);
    }
    private static void display(node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int product(node root){
        if(root == null) return 1;
        int p = 1;
        if(root.val == 0){
            root.val = 1;
        }
        p = p * root.val * product(root.left) * product(root.right);
        return p;
    }
}
