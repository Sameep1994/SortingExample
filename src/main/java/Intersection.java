public class Intersection {
    public static void main(String[] args) {
        int[] ip1={3,5,10,10,10,15,15,20};
        int[] ip2={5,10,10,15,30};
        Intersect(ip1,ip2);
    }

    public static void Intersect(int[] a,int[] b){
        int i=0,j=0,n=a.length,m=b.length;
        while (i<n && j<m){
            if(i>0 && a[i-1] == a[i]){
                i++;
                continue;
            }

            if(a[i]<b[j]){
                i++;
            }else if(b[j]<a[i]){
                j++;
            }else{
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
    }
}
