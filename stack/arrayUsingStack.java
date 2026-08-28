package stack;
public class arrayUsingStack {
    public static class Stack{
        private int [] arr = new int[5];
        private int idx = 0;
        void push(int x){
            if(isFull()){
                System.out.println("OverLoading");
            }
            arr[idx++] = x;
        }
        void display(){
            for(int i = 0; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
        }
         int pop(){
            if(idx==0){
                System.out.println("EMPTY");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        int peek(){
            if(idx==0){
                System.out.println("EMPTY");
                return -1;
            }
            int top = arr[idx-1];
            return top;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx == arr.length) return true;
            else return false;
        }
    } 
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println();
        System.out.println("pop : " + st.pop());
        st.display();
        st.pop();
        System.out.println();
        System.out.println(st.peek());
        st.pop();
        st.display();
        st.pop();
        st.display();
    }
}
