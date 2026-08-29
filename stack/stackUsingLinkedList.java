package stack;
class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Stack{
    private Node head = null;
    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    int pop(){
        if(isEmpty()) {
            System.out.println("Stack underflow ");
            return -1;
        }
        Node temp = head;
        int top = temp.val;
        temp = temp.next;
        head = temp;
        return top;
    }
    int peek(){
        Node temp = head;
        int top = temp.val;
        return top;
    }
    boolean isEmpty(){
        Node temp = head;
        if(temp == null) return true;
        else return false;
    }
}
public class stackUsingLinkedList {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println();
        System.out.println("pop : "+ st.pop());
        System.out.println("peak : "+ st.peek());
        st.display();
        System.out.println();
        st.push(100);
        st.display();
    }
}
