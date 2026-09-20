package Queue;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
class queue{
    private node head = null;
    private node tail = null;
    void add(int val){
        node temp = new node(val);
        if(head == null){
            temp.next = head;
            head = tail = temp;
        }
       tail.next = temp;
        tail = temp;
    }
    int dequeue(){
        if(head == null){
            System.out.println("Queue is empty");
            return 0;
        }
        node temp = head;
        int top = temp.val;
        temp = temp.next;
        head = temp;
        return top;
    }
    int peek(){
        if(head == null){
            System.out.println("Queue is empty");
            return 0;
        }
        int top = head.val;
        return top;
    }
    void display(){
        node temp = head;
        if(head==null){
            System.out.println("Queue is empty");
            return;
        }
        while(temp!=tail.next){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
    }
}
public class queue_using_linkedlist {
    public static void main(String[] args) {
        queue q = new queue();
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        q.dequeue();
        System.out.println();
        q.display();
        System.out.println();
        System.out.println(q.peek());
    }
}
