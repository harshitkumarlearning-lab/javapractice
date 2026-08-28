// Shortest method to find max term in array in java.

public class max_element1 {
    public static void main(String[] args) {
        int [] arr = {-87,-34,-3,-6,-2,-8,-76};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,arr[i]);
        }
        System.out.println("Min value is : "+ max);
    }
}
