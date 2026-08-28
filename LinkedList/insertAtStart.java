package LinkedList;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
        this.next=null;
    }
}
class sll {
    node head;
    node tail;

    void insert(int val) {
        node temp = new node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    void is(int val) {
        node temp = new node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println(); 
    }
}

public class insertAtStart {
    public static void main(String[] args) {
        sll list = new sll();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display(); // Output: 10 20 30 
        list.is(50);
        list.display(); // Output: 50 10 20 30 
    }
}