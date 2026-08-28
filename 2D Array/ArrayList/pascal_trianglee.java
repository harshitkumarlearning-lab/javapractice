package ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascal_trianglee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>>arr = new ArrayList<>();
         for(int i = 0; i < n ;i++)
         {
            List<Integer>x=new ArrayList<>();
            for(int j = 0; j <= i; j++)
            {
                x.add(1);
            }
            arr.add(x);
         }
         for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                arr.get(i).set(j,arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
            }
         }
         for (int i = 0; i < n; i++) {
             System.out.println(arr.get(i));
         }
        
    }
}
