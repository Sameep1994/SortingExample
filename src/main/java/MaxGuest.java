import java.util.Arrays;

public class MaxGuest {
    public static void main(String[] args) {
        int[] a={900,600,700};
        int[] b={1000,800,730};
        System.out.println(Meetmax(a,b));
    }
//sort arrival and departure arrays
//count min as 1 since we can meet atleast one guest at a time and init arrival array from 1 and dep array from 0
//if arrival is less than departure there is an arrival and we increment the guest count else decrease
    public static int Meetmax(int[] arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,res=1,max=0;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                res++;
                i++;
            }else{
                res--;
                j++;
            }
            max=Math.max(res,max);
        }
        return max;
    }
}
