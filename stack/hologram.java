package stack;
import java.util.Scanner;
import java.util.Stack;

public class hologram {
    public static void lra(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int max=0;
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            int ch;
            if (i==n) ch=0;
            else ch = arr[i];
            while (!st.isEmpty() && ch<arr[st.peek()]) {
                int h = arr[st.pop()];
                int l;
                if (st.isEmpty()) {
                    l=1;
                } 
                else {
                    l=st.peek();
                }
                int w =i-l-1;
                max = Math.max(max,h*w);
            }
            st.push(i);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        lra(arr);
    }
}
