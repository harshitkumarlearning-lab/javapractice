package recurtion;
import java.util.Scanner;
import java.util.ArrayList;
public class print_inc_seq {
    public static void check(int j, int n, int k, ArrayList<Integer> ans){
        if(ans.size()==k){
            for(int ele : ans) System.out.print(ele + " ");
            System.out.println();
            return;
        }
        for(int i=j; i<=n;i++){
            ans.add(i);
            check(i+1,n,k,ans);
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       ArrayList<Integer> ans = new ArrayList<>();
       if(k>0&&k<= n) check(1, n, k, ans);
       sc.close();
    }
}
