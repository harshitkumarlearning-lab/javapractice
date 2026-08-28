package LinkedList;
// Node class;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
        this.next=null;
    }
}
public class listnodeclass {
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        a.next=b;
        b.next=c;
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
    }
}
