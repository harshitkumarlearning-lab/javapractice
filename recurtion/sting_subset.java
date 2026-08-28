package recurtion;
import java.util.ArrayList;
import java.util.Scanner;
public class sting_subset {
    static ArrayList<String> arr = new ArrayList<>();
    public static void check(int i,String str,String ans){
        if(i == str.length()){
            arr.add(ans);
            return;
        }
        check(i+1,str,ans);
        ans = ans +str.charAt(i);
        check(i+1,str,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new ArrayList<>();
        String str = "abc";
        check(0,str,"");
        System.out.println(arr);
    }
}
