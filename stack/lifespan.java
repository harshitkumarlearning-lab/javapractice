package stack;
import java.util.Scanner;
import java.util.Stack;
public class lifespan {
    public static void stockSpan(int [] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]) st.pop();
            if(st.isEmpty()) res[i] = i+1;
            else res[i] = i-st.peek();
            st.push(i);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        stockSpan(arr);
    }    
}
