public class CountInversion {

    public static void main(String[] args) {

        int arr[] = {2,4,1,3,5};

        int n = arr.length;
        System.out.print(countInv(arr,0,n-1));
    }

    static int countInv(int arr[], int l, int r)
    {
        int res = 0;
        if (l<r) {

            int m = (r + l) / 2;
//count inversion in left half
            res += countInv(arr, l, m);
//count inversion in right half
            res += countInv(arr, m + 1, r);
//count inversion between element in left and right halves
            res += countAndMerge(arr, l, m , r);
        }
        return res;
    }

    static int countAndMerge(int arr[], int l, int m, int r)
    {
        int n1=m-l+1, n2=r-m;
        int[] left=new int[n1];int[] right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];
        int res=0,i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
            {arr[k++]=left[i++];}
            else{
                arr[k++]=right[j++];
                //since it is less than one element of first array, it will be less than rest element of array
                res=res+(n1-i);
            }
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];
        return res;
    }
}
