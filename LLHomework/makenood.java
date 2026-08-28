package LLHomework;
class node {
    int val;
    node next;
    node(int val){
        this.val = val;
    }
    node(int val, node next){
        this.val = val;
        this.next = next;
    }
}
class solution{
    void mid (node head){
        node fast = head.next;
        node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.val);
    }
}
public class makenood {
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        solution sol = new solution();
        sol.mid(a);
    }
}
