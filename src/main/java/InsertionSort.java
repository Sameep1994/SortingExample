public class InsertionSort {
    public static void main(String[] args) {
        int[] ip = {50,20,40,60,10,30};
        int[] op = new int[ip.length];
        op=insSort(ip);
        for(int i=0;i<op.length;i++){
            System.out.println(op[i]);
        }
    }
/*
here we are starting from second element and for every elemnt to the left of it we are comapring
 if greater we are shifting to right and finally we are putting the compared element at its place
 worst case n2 reverse sorted array
 best n for sorted array
 fast algo for small set
*/
    public static int[] insSort(int[]a){
        for(int i=1;i<a.length;i++){
         int j=i-1;
         int key=a[i];
         while(j>=0 && a[j]>key){
             a[j+1]=a[j];
             j--;
         }
            a[j+1]=key;
        }
        return a;
    }
}
