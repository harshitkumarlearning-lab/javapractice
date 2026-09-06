package stack;
import java.util.Scanner;
import java.util.Stack;
public class lifespan {
    public static void lifespan(int [] arr){
        Stack<Integer> st = new Stack<>()
        int n = arr.length;
        int s;
        for(int i = 1; i<n; i++){
            s = 1;
            for(int j = 0; j<i; j++){
                if(arr[i]>arr[j]){
                    s++;
                    st.push(s);
                }
            }
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
