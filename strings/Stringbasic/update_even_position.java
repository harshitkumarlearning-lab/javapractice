package Stringbasic;

import java.util.Scanner;

public class update_even_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        for(int i = 0; i < str.length(); i++){
            if(i%2==0){
                s +='a';
            }
            else{
                s+=str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
