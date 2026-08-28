 import java.util.Scanner;

// public class array_sum_method {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int []arr = new int[n];
//         for (int i=0;i<n;i++)
//         {
//             arr[i]= sc.nextInt();
//         }
//         Calculator calc = new Calculator();
//         int sum = calc.add(arr,n);
//         System.out.println(sum);
//     }
// }
// class Calculator
// {
// public static int add(int []arr,int n)
// {
//     int sum =0;
// for(int i=0;i<n;i++){
//     sum = sum + arr[i];
// }
// return sum;
// }

// }




//or

class array_sum_method {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int[] array = new int[n];
for (int i = 0; i < n; i++)
{
array[i] = scanner.nextInt();
}

int sum = calculateSum(array);

System.out.println(sum);
}

public static int calculateSum(int[] array) {

int sum = 0;

for (int num: array) {

sum += num;

}

return sum;
}
}