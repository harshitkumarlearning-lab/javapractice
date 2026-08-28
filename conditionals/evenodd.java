package conditionals;

import java.util.Scanner;

// public class evenodd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number : ");
//         int a = sc.nextInt();
//         if(a > 0){
//         if(a % 2 == 0) System.out.println("Even");
//         else System.out.println("Odd");
//         }
//         else System.out.println("The Number Is Negative");
//     }
// }
 
class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
            if (a % 2 == 0) System.out.println("Even");
            else System.out.println("Odd");
    }
}