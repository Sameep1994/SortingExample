public class Segregate01And2 {
    public static void main(String[] args) {
        int[] ip={2,0,1,1,0,2,2,0};
        DutchFlagAlgo(ip);
        for(int i=0;i<ip.length;i++){
            System.out.println(ip[i]);
        }
    }
//maintain 3 pt one to traverse one for 0 one for 2
//if 1 is encountered traverse to next
//if 0 is encountered increse 0 pt and travrese pt
//if 2 is encountered decrease pt fr 2
//till either traverse pt reaches end or 0 and 2 pt crosses over

    public static int[] DutchFlagAlgo(int[] a){
     int i=0,j=a.length-1,k=0;
     while (k<=j && i<j){
      if(a[k]==0){
          swap(a,i,k);
          k++;
          i++;
      }else if(a[k]==2) {
          swap(a, j, k);
          j--;
      }else if(a[k]==1){
          k++;
      }
     }
        return a;
    }

    public static void swap(int[] array,
                            int position1,
                            int position2) {
        int temp = array[position1];

        array[position1] = array[position2];

        array[position2] = temp;
    }
}
