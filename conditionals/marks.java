package conditionals;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a>0 && a<100)
    {
        if(a>=91) System.out.println("A");
        else if(a>=81) System.out.println("B");
        else if(a>=71) System.out.println("C");
        else if(a>=61) System.out.println("d");
        else System.out.println("Grade is Not up to the mark");
    }
    else 
    {
        System.out.println("Invalid Value");
    }
    }
}
