package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class array_list_printing {
    public static void main(String[] args) {
        List<List<Integer>>arr=new ArrayList<>();
        List <Integer>x=new ArrayList<>();
        x.add(10);x.add(40);x.add(50);
        List <Integer>y=new ArrayList<>();
        y.add(20);
            arr.add(x);
            arr.add(y);
           
           
            //m1 for printing
        //System.out.println(arr);


        //m2 for printing
        // for(int i = 0; i<arr.size();i++)
        // {
        //     System.out.print(arr.get(i));
        // }


        // m3 for printout
        // for (int i = 0; i < arr.size(); i++) {
        //     List<Integer>z =arr.get(i);
        //     for(int j = 0;j<z.size();j++){
        //         System.out.print(z.get(j)+" ");
        //     }
        //     System.out.println();
        // }


        //m4 for printing
        for (int i = 0; i < arr.size(); i++) {
            for(int j = 0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
