package Queue;
class cqa{
    int size = 0;
    int f = -1;
    int r = -1;
    int arr[] = new int[5];
    int n =arr.length;
    void add(int val){
        if(size==0){
            f=r=0;
            arr[0]=val;
            size++;
        }
        else if(size == n){
            System.out.println("queue is full");
            return;
        }
        else if(r<n-1){
            arr[++r]=val;
            size++;
        }
        else if(r==n-1){
            r = 0;
            arr[0] = val;
            size++;
        }
    }
    int remove(){
        if(size == 0){
            System.out.println("queue is empty");
            return 0;
        }
        else if(f==n-1){
            int val = arr[f];
            f = 0;
            size--;
            return val;
        }
        else{
            int val = arr[f++];
            size--;
            return val;
        }
    }
    int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return 0;
        }
        return arr[r];
    }
    void display(){
        if(f <= r){
            for(int i = f; i<=r; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else if(f>r){
            for(int i = f; i<=n-1; i++){
                System.out.print(arr[i]+" ");
            }
            for(int i  = 0; i<=r; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
public class circular_queue_using_array {
    public static void main(String[] args) {
        cqa a = new cqa();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.display();
        System.out.println();
        a.remove();
        a.add(60);
        a.display();
        System.out.println();
        System.out.println(a.peek());
    }
}
