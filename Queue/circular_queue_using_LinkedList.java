package Queue;
class node{
    int val;
    node next;
    node(int val){
        this.val = val;
    }
}
class cql{
    node head = null;
    node tail = null;
    void add(int val){
        node temp = new node(val);
        if(head == null){
            temp.next = head;
            head = tail = temp;
            tail.next = head;
        }
        else{
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
    }
    int remove(){
        if(head == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int val = head.val;
        if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
            tail.next = head;
        }
        return val;
    }
    int peek(){
        if(head == null){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.val;
    }
    void display(){
        System.out.print(head.val+" ");
        head = head.next;
        while(head!=tail.next){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }
}
public class circular_queue_using_LinkedList {
    public static void main(String[] args) {
        cql a = new cql();
        a.add(10);
        a.add(20);
        a.add(30);
        a.display();
        a.remove();
        a.add(60);
        a.display();
        System.out.println(a.peek());
    }
}
