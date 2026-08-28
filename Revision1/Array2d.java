package Revision1;
import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //2d array declaration. 
        int[][]arr = new int[m][n];

        //taking input from 3d array.
        //arr.length---> is for row length.
        //arr[0].length--->is for column declaration.

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();//we can take infput from this.
            }
        }
        // use of for each loop is 2d array.
        for(int [] ele : arr){
            for(int x : ele){
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }
}
