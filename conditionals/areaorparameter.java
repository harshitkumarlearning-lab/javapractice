package conditionals;

import java.util.Scanner;

public class areaorparameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length: ");
        int a = sc.nextInt();
        System.out.print("enter the breadth: ");
        int b = sc.nextInt();
        int area = a*b;
        int perimeter = 2*(a+b);
        if (area > perimeter){
            System.out.println(" Area is greater then parameter\n Area is :"+area );
        }
        else{
            System.out.println(" Peremeter is greater than area\n peremeter is :"+perimeter);
        }
    }
}
