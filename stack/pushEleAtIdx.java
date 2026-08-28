package stack;
import java.util.Scanner;
import java.util.Stack;
public class pushEleAtIdx {
    public static void main(String[] args) {
        Stack <Integer> a = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Index: ");
        int idx = sc.nextInt();
        System.out.print("Enter the value: ");
        int val = sc.nextInt();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        Stack <Integer> b = new Stack<>();
        for(int i = 0; i<a.size()-idx; i++){
            b.push(a.pop());
        }
        a.push(val);
        while(!b.isEmpty()){
            a.push(b.pop());
        }
        System.out.println(a);
    }
}
