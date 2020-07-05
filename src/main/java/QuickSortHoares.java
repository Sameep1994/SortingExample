public class QuickSortHoares {
    public static void main(String[] args) {
        int[] ip={8,4,7,9,3,10,5};
        qSort(ip,0,ip.length-1);
        for(int i=0;i<ip.length;i++){
            System.out.println(ip[i]);
        }
    }

    public static void qSort(int[] a,int l,int h){
        if(l<h){
            int p=hoaresPartition(a, l, h);
            //since the pivot is placed at right place recursion excludes that element in its call
            qSort(a,l,p);
            qSort(a,p+1,h);
        }
    }
//hoares partition has lowest index element as pivot
//it starts from element i=-1 and j=high+1
//and move unless any element at i is less than pivot and element at j is greater than pivot
//when encountered otherwise swap elements
    public static int hoaresPartition(int[] a,int low,int high){
        int pivot=a[low];
        int i=low-1;
        int j=high+1;
        while(true){
            do{
                i++;
            }while(a[i]<pivot);
            do {
                j--;
            }while (a[j]>pivot);
            if(i>=j) return j;
            swap(a,i,j);
        }
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
