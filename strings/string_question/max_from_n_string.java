package string_question;
import java.util.Scanner;
public class max_from_n_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] str= new String[n];
        for(int i = 0; i<n; i++){
            str[i]=sc.nextLine();
        }
        String mx = str[0];
        for(int i = 1; i<n; i++){
            mx=max(mx,str[i]);
        }
        System.out.println(mx);
    }
    public static String max(String a, String b){
        String s = purify(a),t=purify(b);
        if(s.length()>t.length()) return a;
        if(s.length()<t.length()) return b;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }
    public static String purify(String a){
        for(int i = 0; i<a.length();i++){
            if(a.charAt(i)!=0) return a.substring(i);
        }
        return a;
    }
}
