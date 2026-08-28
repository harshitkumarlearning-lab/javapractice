package Revision1.strings;
import java.util.Scanner;
public class sbasic {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();

        // use of charAt()-->tell the character at particular index.
        char ch = str.charAt(3);
        System.out.println(ch);

        //use of length()-->it will count the length of the string
        System.out.println(str.length());

        //use of indexOf()-->it will found out the inndex of particular character.
        int idx = str.indexOf('h');
        System.out.println(idx);

        //use of lastIndexOf()-->it will find out the index of a character from last.
        idx = str.lastIndexOf('h');
        System.out.println(idx);

        String gtr = sc.nextLine();
        
        //Use of compareTo()-->this means that we are comareing 2 different string str and gtr
        System.out.println(str.compareTo(gtr));

        //use of contain()--> it means sting is present in substing or not.
        System.out.println(str.contains(gtr));

        //use of endsWith()-->it tells wether substrring starts with particular caracter or not.
        System.out.println(str.startsWith(gtr));

        //use of endsWith()-->it tells wether substring ends with particular character or not.
        System.out.println(str.endsWith(gtr));
    }
}
