package recurtion;
import java.util.Scanner;
import java.util.ArrayList;
public class generate_parenthesis {
    public static void check(int open, int close, int n , String ans){
        if(ans.length()==2*n){
            System.out.println(ans);
            return;
        }
        if(open<n) check(open+1,close,n,ans+"(");
        if(close<open) check(open,close+1,n,ans+")"); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        check(0,0,n,"");
    }
}
