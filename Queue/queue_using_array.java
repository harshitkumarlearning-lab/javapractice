package Queue;
public class queue_using_array {
    public static class queue{
        int f = -1;
        int r = -1;
        int size = 0;
        int []arr = new int[5];
        void enqueue(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            else if(f==-1){
                arr[0] = val;
                f=r=0;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        int dequeue(){
            if(size==0){
                System.out.println("Queue is empty");
                return 0;
            }
            f++;
            size++;
            return arr[f-1];
        }
        int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return 0;
            }
            return arr[f];
        }
        void display(){
            System.out.println("Value inside queue");
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            for(int i = f; i<=r; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.display();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        System.out.println();
        System.out.println("deleted: "+ q.dequeue());
        System.out.println("peek: "+ q.peek());
        q.enqueue(100);
        q.display();
    }
}
