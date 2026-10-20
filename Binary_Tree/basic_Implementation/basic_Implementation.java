package Binary_Tree.basic_Implementation;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val = val;
    }
}
public class basic_Implementation {
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(4);
        node c = new node(3);
        node d = new node(2);
        node e = new node(6);
        node f = new node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        display(a);
    }
    private static void display(node root){
        if(root == null) return ;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
}
