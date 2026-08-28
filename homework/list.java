package homework;
import java.util.Scanner;
import java.util.ArrayList;
class list {
    public static int ans(ArrayList<Integer>arr, int x){
        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i)==x) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer>arr = new ArrayList<>();
       int n = sc.nextInt();
       for(int i = 0; i<n; i++){
           arr.add(i,sc.nextInt());
       }
       int x = sc.nextInt();
       int idx = ans(arr,x);
       System.out.println(idx);
    }
}