public class CountSort {
    public static void main(String[] args) {
    int[] ip={1,4,4,1,0,1};
    int n=ip.length;
    int k=5;
    int[] op=countSort(ip,n,k);
    for(int i=0;i<op.length;i++){
        System.out.println(op[i]);
    }
    }
/*k is the range, its not a comparision based algorithm
* theta(n+k) time and space*/
    public static int[] countSort(int[] a,int n,int k){
        //count array of size k
        int[] count = new int[k];
        //init count array as 0
        for(int i=0;i<k;i++){
            count[i]=0;
        }
//increment occurence of every element
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
//count element of elements smaller than or equal to the current element, start from 1 since nothing less than 0
        for(int i=1;i<n;i++){
            count[i]=count[i-1]+count[i];
        }
//imp: 1. use the lement in ip array as index in count array
//count array gives the position of element in output array
//and decrement its count so that when we encounter same element next time we place it before
// (stability) gfg video(12:00)
//element is decided from ip array position in op is defined by count array
        int[] op=new int[n];
        for(int i=n-1;i>=0;i--){
            op[count[a[i]-1]]=a[i];
            count[a[i]]--;
        }
//copy output array to orignal array
        for(int i=0;i<n;i++){
            a[i]=count[i];
        }
        return a;
    }
}
