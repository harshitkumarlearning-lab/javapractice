package linkedlist1;
class node {
    int val;
    node next;
    node(int val){
        this.val=val;
        this.next=null;
    }
}
class sll{
    node tail;
    node tail(node head){
        node temp = head;
        while(temp != null){
            if(temp.next == null){
                tail = temp;
                return tail;
            }
            temp = temp.next;
        }
        return null;
    }
}
public class sll1 {
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        a.next = b;
        b.next = c;
        sll list = new sll();
        node last = list.tail(a);
        if(last != null){
            System.out.println("Tail node value: " + last.val);
        } else {
            System.out.println("List is empty");
        }
    }
}
