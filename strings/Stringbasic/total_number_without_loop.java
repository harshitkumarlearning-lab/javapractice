package Stringbasic;

import java.util.Scanner;

public class total_number_without_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = ""+n;
        System.out.println(s.length());


        //using invuilt method

        String str = Integer.toString(n);
        System.out.println(str.length());
    }
}
