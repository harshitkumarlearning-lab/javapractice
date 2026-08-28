package string_question;

import java.util.Scanner;

public class isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        char [] a = new char [128];
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            char ph = t.charAt(i);
            int idx = (int)ch;
            if(a[idx]=='\0') a[idx]=ph;
            else{
                if(a[idx]!=ph){
                    System.out.println(false);
                }
            }
        }
        for(int i = 0; i<128; i++){
            a[i]='\0';
        }
        for(int i = 0; i<t.length();i++){
            char ch = s.charAt(i);
            char ph = t.charAt(i);
            int idx = (int)ph;
            if(a[idx]=='\0') a[idx]=ch;
            else{
                if(a[idx]!=ch){
                    System.out.println(false);
                }
            }
        }
        System.out.println(true);
    }
}

