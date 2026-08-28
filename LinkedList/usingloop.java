package LinkedList;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
        this.next=null;
    }
}
public class usingloop {
//     public static void print(node head){
//     node temp = head;
//     while(temp!=null){
//         System.out.println(temp.val);
//         temp = temp.next;
//     }
// }
//  Recursive method
    public static void print(node head){
        if(head == null) return;
        System.out.println(head.val);
        print(head.next);
}
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        a.next = b;
        b.next = c;
        print(a);
    }
}
