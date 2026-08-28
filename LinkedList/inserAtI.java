package LinkedList;
class node{
    int val;
    node next;
    node(int val){
        this.val = val;
        this.next=null;
    }
}
class ll{
    node head;
    node tail;
    void insertnd(int val){
        node temp = new node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    void display(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.val);
            temp=temp.next;
        }
    }
}
public class inserAtI {
    public static void main(String[] args) {
        
        ll list = new ll();
        list.insertnd(100);
        list.display();
    }
}
