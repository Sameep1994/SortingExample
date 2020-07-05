public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int[] ip = {1, 0, 0, 1, 1, 0, 0, 1};
        hoaresPartition(ip, 0, ip.length);
        for (int i = 0; i < ip.length; i++) {
            System.out.println(ip[i]);
        }
    }

    /*for segregation 0s and 1s we are just partitioning by changing the pivots*/
    public static int[] hoaresPartition(int[] a, int low, int high) {
        int i = - 1;
        int j = high;
        while (true) {
            do {
                i++;
            } while (a[i] == 0);
            do {
                j--;
            } while (a[j] == 1);
            if (i >= j) return a;
            swap(a, i, j);
        }
    }

    public static void swap(int[] array,
                            int position1,
                            int position2) {
        int temp = array[position1];

        array[position1] = array[position2];

        array[position2] = temp;
    }
}
