package Revision1;
import java.util.Scanner;
public class first_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        calculator calc = new calculator();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int res = calc.index(arr,x);
        if(res == -1){
            System.out.println(-1);
        }
        else{
            System.out.println(res);
        }
    }
}
class calculator{
    int index(int arr[],int x){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
