public class kSamllest {
    public static void main(String[] args) {
     int[] ip={10,8,5,11,6,26};
     int k=2;
        System.out.println(kth(ip,k));
    }

//QUICKSELECT
//since lomuto partition gives right pos of pivot, we use the partition
//and then according to the pos of k we move either left or right of the pivot like binary search
    public static int kth(int[] a,int k){
        int l=0,r=a.length-1;
        while(l<=r){
            int p= lumutoPartition(a,l,r);
            if(p==k-1)
                return a[p];
            else if(p > k-1)
                r=p-1;
            else
                l=p+1;
        }
        return -1;
    }

    public static int lumutoPartition(int[] a,int low,int high){
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(a[j]<pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return (i+1);
    }
    public static void swap(int[] array,
                            int position1,
                            int position2)
    {
        int temp = array[position1];

        array[position1] = array[position2];

        array[position2] = temp;
    }
}
