package stringbuilder;
import java.util.Scanner;
public class upperCase_TO_lower_and_vica_versa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            int ascaii = (int)ch;
            if(ch>='a'&&ch<='z')
            {
                ascaii -=32;
                ch=(char)ascaii;
                sb.setCharAt(i, ch);
            }
            else if(ch>='A'&&ch<='Z')
            {
                ascaii +=32;
                ch=(char)ascaii;
                sb.setCharAt(i, ch);
            }
        }
        System.out.println(sb);
    }
}
