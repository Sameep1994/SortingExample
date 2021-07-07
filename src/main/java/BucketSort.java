import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        //to do
        int[] a ={30,40,10,80,5,12,70};
        int k=4;
        bucketSort(a,k);
        for(int i:a){
            System.out.println(i);
        }
    }
    //k is the number of buckets
    public static void bucketSort(int[] a,int k){
        //1. find the max element in bucket and range will be 0 to max element
        int n = a.length,m=a[0];
        for(int i=0;i<n;i++){
            m=Math.max(m,a[i]);
        }
        //because in range from 0-n, n is excluded
        m++;
        //2.Declare the buckets
        ArrayList<ArrayList<Integer>> bkt = new ArrayList<>();
        for(int i=0;i<k;i++){
            bkt.add(new ArrayList<Integer>());
        }
        //3.fill the buckets
        for(int i=0;i<n;i++){
            //formula to chose the bucket
            int bi=(k*a[i])/m;
            bkt.get(bi).add(a[i]);
        }

        //4.sort the buckets
        for(int i=0;i<k;i++){
            Collections.sort(bkt.get(i));
        }
        //5.concat the buckets
        int index =0;
        for(int i=0;i<k;i++){
            for(int j=0;j<bkt.get(i).size();j++)
                a[index++]=bkt.get(i).get(j);
        }
    }
}
