public class Union {
    public static void main(String[] args) {
        int[] ip1 = {3, 8, 10};
        int[] ip2 = {2, 8, 9, 10, 15};
        ArrUnion(ip1, ip2);
    }

    public static void ArrUnion(int[] a, int[] b) {
        int i = 0, j = 0, n = a.length, m = b.length;
        while (i < n && j < m) {
            if (i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            if (j > 0 && b[j - 1] == b[j]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.println(a[i]);
                i++;
            } else if(b[j]<a[i]) {
                System.out.println(b[j]);
                j++;
            }else{
                System.out.println(a[i]);
                i++;
                j++;
            }
        }

        while (i<m){
            if(i==0||a[i]!=a[i-1]){
                System.out.println(a[i]);
                i++;
            }
        }

        while (j<n){
            if(j==0||b[j]!=b[j-1]){
                System.out.println(b[j]);
                j++;
            }
        }
    }
}

