package LinkedList;
class sll{
    node head;
    node tail;
    int size;
    void insert(int val){
        node temp = new node(val);
        if(head == null){
            head=tail=temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    
    void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
    }
}
public class insertAtEnd {
    public static void main(String[] args) {
        sll list = new sll();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        System.out.println();
        list.insert(100);
        list.display();
        System.out.println();
        System.out.println(list.size);
    }
}
