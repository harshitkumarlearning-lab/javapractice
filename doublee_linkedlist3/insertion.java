package doublee_linkedlist3;
class Node {
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}
class dll{
    Node head;
    Node tail;
    int size= 0;

    // Insert at end
    void insertend(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }


    //insert at begin
    void insertBegin(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtKth(int val, int idx){
        Node temp = new Node(val);
        Node x = head;
        if(idx==0){
            insertBegin(val);
            return;
        }
        if(idx==size){
            insertend(val);
            return;
        }
        if(idx>size){
            System.out.println("invalid pos");
            return;
        }
        for(int i = 0; i<idx-1; i++){
            x = x.next;
        }
        Node c = x.next;
        temp.next = c;
        x.next = temp;
        c.prev = temp;
        temp.prev = x;
        size++;
    }

    //display
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
    }
}
public class insertion {
    public static void main(String[] args) {
        dll list = new dll();
        list.insertend(10);
        list.insertend(20);
        list.insertend(30);
        list.insertend(40);
        list.display();
        System.out.println();
        list.insertBegin(90);
        list.insertBegin(1100);
        list.insertBegin(50);
        list.display();
        System.out.println();
        list.insertAtKth(30,3);
        list.display();
    }
}
