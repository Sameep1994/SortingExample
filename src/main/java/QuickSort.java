public class QuickSort {
    public static void main(String[] args) {
        int[] ip={8,4,7,9,3,10,5};
        qSort(ip,0,ip.length-1);
        for(int i=0;i<ip.length;i++){
            System.out.println(ip[i]);
        }
    }

    public static void qSort(int[] a,int l,int h){
        if(l<h){
            int p=lumutoPartition(a, l, h);
            //since the pivot is placed at right place recursion excludes that element in its call
            qSort(a,l,p-1);
            qSort(a,p+1,h);
        }
    }
//lomuto partition uses the lst element as pivot
//maintains an index i till which elements less that pivot and after that pivot which is correct pos of element then j greater
//whenever encounters an element gt pivot increase i and swap with j and j start from low to less high-1
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
