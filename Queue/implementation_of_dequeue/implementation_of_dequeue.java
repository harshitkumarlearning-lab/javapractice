package Queue.implementation_of_dequeue;

class node{
    int val;
    node next;
    node prev;
    node(int val){
        this.val = val;
    }
}

class dequeue{
    private int size=0;
    private node front=null;
    private node rear=null;

    void addfront(int val){
        node temp = new node(val);
        if(front==null){
            front = rear = temp;
        }
        else{
            temp.next = front;
            front.prev = temp;
            front = temp;
        }
        size++;
    }

    void addrear(int val){
        node temp = new node(val);
        if(rear==null){
            front = rear = temp;
        }
        else{
            rear.next = temp;
            temp.prev = rear;
            rear = temp;
        }
        size++;
    }

    int deletefront(){
        node temp = front;
        if(front == null){
            System.out.print("queue is empty");
            return -1; 
        }
        int top = temp.val;
        if(front == rear){
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null; 
        }

        size--;
        return top;
    }

    int deleterear(){
        node temp = rear;
        if(rear == null){
            System.out.print("queue is empty");
            return -1;
        }
        int del = rear.val;
        if(front == rear){
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null; 
        }
        size--;
        return del;
    }

    int getfront(){
        if(front == null){
            System.out.print("queue is empty");
            return -1;
        }
        int val = front.val;
        return val;
    }

    int getrear(){
        if(rear == null){
            System.out.print("queue is empty");
            return -1;
        }
        int val = rear.val;
        return val;
    }
    int size(){
        return size;
    }

    void display(){
        if(front == null){
            System.out.println("queue is empty");
            return;
        }

        node temp = front;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class implementation_of_dequeue {
    public static void main(String[] args) {
        dequeue d = new dequeue();
        d.addfront(10);
        d.addfront(20);
        d.addrear(30);
        d.addfront(40);
        d.display();
    }
}