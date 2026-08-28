package Revision1;
import java.util.Arrays;
import java.util.Scanner;
public class inbuilt_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        calculator calc = new calculator();
        calc.sort(arr);
        calc.shalow_copy(arr);
        calc.deep_copy(arr);
    }
}
class calculator{
    int res;
    void sort(int arr[]){
        // sorting using inbuilt function
        Arrays.sort(arr);
        // use of for each element 
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    void shalow_copy(int []arr){
        int [] brr = arr;//Shallow copy
        brr[0]=70;
        System.out.println("After shallow copy, arr[0]: " + arr[0]);
    }
    void deep_copy(int [] arr){
        int [] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 99; // show deep copy effect
        System.out.print("After deep copy, brr: ");
        for(int x : brr){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Original arr after deep copy: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}