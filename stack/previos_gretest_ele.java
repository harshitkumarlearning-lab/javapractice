package stack;
import java.util.Scanner;
import java.util.Stack;
public class previos_gretest_ele {
    public static void pge(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[0] = -1;
        st.push(arr[0]); 
        for(int i = 1; i<n; i++){
            while(!st.isEmpty()&&st.peek()<arr[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        for(int i = 0; i<n; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        pge(arr);
    }
}