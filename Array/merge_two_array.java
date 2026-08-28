public class merge_two_array {
    public static void main(String[] args) {
        int []a={11,33,42,71}; 
        int []b={26,54,69,81}; 
        int l1=a.length;
        int l2=b.length;
        int []c=new int[l1+l2];
        int i=0,j=0,k=0;
        while(i<l1 && j<l2)
        {
            if(a[i]<=b[j])
            {
                c[k]=a[i];
                i++;
                k++;
            }
            else
            {
                c[k]=b[j];
                k++;
                j++;
            }
        }
        if(i==l1)
        {
            while(j<l2)
            {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==l2)
        {
            while(i<l1)
            {
                c[k]=a[i];
                i++;
                k++;
            }
        }
        for(int ele : c)
        {
            System.out.print(ele+" ");
        }
    }
}
