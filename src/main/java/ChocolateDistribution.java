import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] ip={7,3,2,4,9,12,56};
        int k=3;
        System.out.println(chochDist(ip,k));
    }

    //num of choclates in each bag is given in an array
    //that has to be distributed among m kids such that the person got max and person got min diff is least
    //sort and use two pointer approach
    public static int chochDist(int[] a,int k){
        Arrays.sort(a);
        int res=a[k-1]-a[0];
        for(int i=1;(i+k-1)<a.length;i++){
            res=Math.min(res,(a[i+k-1]-a[i]));
        }
        return res;
    }
}
