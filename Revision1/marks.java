package Revision1;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(arr[i]<35){
                System.out.println("The roll no of student having marks less than 35 is = " + (i+1));
            }
        }
    }
}
