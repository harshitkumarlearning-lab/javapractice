package string_question;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int []arr = new int[26];
        for(int i = 0; i<n; i++)
        {
            char ch = s.charAt(i);
            int idx = (int)ch-97;
            arr[idx]++;
        }
        int max = -1;
        for(int i = 0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==max){
                char ch = (char)(i+97);
                System.out.print(ch+" ");
            }
        }
}
}
