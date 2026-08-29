package stack;
import java.util.Scanner;
import java.util.Stack;
public class Next_gretest_ele {
    public static void nge(int [] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[arr.length];
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i = n-2; i>=0; i--){
            while(st.size()!=0 && arr[i]>st.peek()){
                st.pop();
            }
            if(st.size()==0){
                res[i] = -1;
            }
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
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        nge(arr);
    }
}
