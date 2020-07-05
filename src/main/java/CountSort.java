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

    public static int[] countSort(int[] a,int n,int k){
        int[] count = new int[k];
        for(int i=0;i<k;i++){
            count[i]=0;
        }

        for(int i=0;i<n;i++){
            count[a[i]]++;
        }

        for(int i=1;i<n;i++){
            count[i]=count[i-1]+count[i];
        }

        int[] op=new int[n];
        for(int i=n-1;i>=0;i--){
            op[count[a[i]]]=a[i];
            count[a[i]]--;
        }

        for(int i=0;i<n;i++){
            a[i]=count[i];
        }
        return a;
    }
}
