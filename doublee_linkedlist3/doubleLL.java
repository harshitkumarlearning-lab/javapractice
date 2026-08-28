package doublee_linkedlist3;
class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}
public class doubleLL {
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void rev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
    }
    public static void npoint(Node point){
        Node temp = point;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        print(temp);
    }
    public static int check(Node head, Node tail){
        int flag = 0; 
        while(head!=tail){
            flag = 0;
            if(head.val!= tail.val){
                flag = 1;
                return flag;
            }
            head = head.next;
            tail = tail.prev;
        }
        return flag;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(30);
        Node c = new Node(20);
        Node d = new Node(10);
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        System.out.print("From head to tail\n");
        print(a);
        System.out.println();
        System.out.print("From tail to head\n");
        rev(d);
        System.out.println();
        System.out.print("from anywere in the node to print all\n");
        npoint(c);
        int flag = check(a,d);
        if(flag == 1) System.out.println("Not palendrome\n");
        else if(flag == 0)System.out.println("palendrome\n");
    }
}
