package Stringbasic;

import java.util.Scanner;

public class charAt_lenght {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//initialisation of string.
        System.out.println(str);
        char ch = str.charAt(3);//use of char at.
        System.out.println(ch);
        int l = str.length();//will show the length of the stringg
        System.out.println(l);
    }
}
