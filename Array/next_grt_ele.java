public class next_grt_ele {
    public static void main(String[] args) {
        int [] arr = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        int [] brr = new int [n];
        brr[n-1]=-1;


        //(METHOD =1)*not effective


        // for(int i=0;i<n-1;i++)
        // {
        //     int max = Integer.MIN_VALUE;
        //     for(int j=i+1;j<n;j++)
        //     {
        //        max = Math.max(max,arr[j]);
        //     }
        //     brr[i]=max;
        
        // }
        int max =arr[n-1];
        for(int i = n-2; i>=0 ;i--)
        {
            brr[i]=max;
            max=Math.max(max, arr[i]);
        }

       for(int ele : arr)
       {
        System.out.print(ele+" ");
       }
       System.out.println();
        for(int ele : brr)
    {
        System.out.print(ele+" ");
    }
    }
}

