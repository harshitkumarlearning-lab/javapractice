package Revision1;
import java.util.Scanner;
public class mergeSortde{
    public static void merge (int a[], int b[], int c[],int l){
        int i = a.length-1;
        int j = b.length-1;
        int k=l-1;
        while(i>=0 && j>=0){
            if(a[i]<=b[j]){
                c[k]= b[j];
                k--;
                j--;
            }
            else{
                c[k]=a[i];
                k--;
                i--;
            }
        }
        if(i<0){
            while(j>=0){
                c[k]=b[j];
                k--;
                j--;
            }
        }
        if(j<0){
            while(i>=0){
                c[k]=a[i];
                k--;
                i--;
            }
        }
        for(int m = 0; m<c.length;m++){
            System.out.print(c[m]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = m+n;
        int a[] = new int [n];
        int b[] = new int [m];
        int c[] = new int [l];
       for(int i = 0; i<a.length ;i++){
            a[i]= sc.nextInt();
        }
        for(int i = 0; i<b.length ;i++){
            b[i]= sc.nextInt();
        }
        merge(a,b,c,l);
    }
}