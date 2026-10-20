package Binary_Tree.levelOrderPrintingDFS;
import java.util.Scanner;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val = val;
    }
}
public class levelOrderPrintingDFS {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        for(int x = 0; x<=3; x++){
            n = x;
            nth(a,0);
            System.out.println();
        }
    }
    private static void nth(node root, int level){
        if(root == null) return;
        if( level== n) System.out.print(root.val+" ");
        nth(root.left,level+1);
        nth(root.right,level+1);
    }
}
