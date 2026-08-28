package LinkedList;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
        this.next = null;
    }
}
class ll{
    node head;
    node tail;
    int size;
    void iae(int val){
        node temp = new node(val);
        if(head==null) head = tail = temp;
        tail.next = temp;
        tail = temp;
        size++;
    }
    void ias(int val){
        node temp = new node(val);
        if(head==null) head = tail = temp;
        temp.next = head;
        head = temp;
        size++;
    }
    void ip(int idx , int val){
        if(idx == 0){
            ias(val);
        }
        if(idx == size-1){
            iae(val);
        }
        node temp = new node(val);
        node x = head;
        for(int i = 0; i<idx; i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    void g(int idx){
        if(idx == 0) System.out.println(head.val);
        if(idx == size-1) System.out.println(tail.val);
        node temp = head;
        for(int i = 0; i<=idx; i++){
            temp = temp.next;
        }
        System.out.println(temp.val);
    }
    void s(int idx , int val){
        if(idx==size-1){
            tail.val = val;
        }
        node temp = head;
        for(int i = 0; i<=idx; i++){
            temp = temp.next;
        }
        temp.val = val;
        size++;
    }
    void d(int idx){
        node temp = head;
        for(int i = 0; i<idx; i++){
            temp=temp.next;
        }
        if(temp.next == tail) temp = tail; 
        temp.next = temp.next.next;
        size--;
    }
    void dis(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}
public class practice1 {
    public static void main(String[] args) {
        ll list = new ll();
        list.iae(10);
        list.iae(20);
        list.iae(30);
        list.dis();
        System.out.println();
        list.ias(40);
        list.ias(50);
        list.dis();
        System.out.println();
        list.ip(3,100);
        list.ip(0,101);
        list.ip(4,150);
        list.dis();
        System.out.println();
        list.g(3);
        list.dis();
        System.out.println();
        list.s(2,1000);
        list.s(0,1001);
        list.s(5,1002);
        list.dis();
        System.out.println();
        list.d(3);
        list.dis();
    }
}
