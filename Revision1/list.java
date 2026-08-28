package Revision1;
import java.util.ArrayList;
import java.util.Scanner;
public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> arr = new ArrayList<>();//creating arraylist
        for(int i = 0; i<n; i++){
            arr.add(sc.nextInt());//inputing arraylist
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr.get(i) +" ");//getting array list
        }
        System.out.println();
        //updating arraylist
        System.out.print("first enter the index to update and then number : ");
        arr.set(sc.nextInt(),sc.nextInt());
        //using the arr.size
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        //removing the element from the array;
        System.out.print("Enter the index of number you want to remove : ");
        arr.remove(sc.nextInt());

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) +" ");
        }
    }
}
