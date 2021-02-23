public class arraySum {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {2,3,4,5,6};
        int[] sum = new int[6];
        for(int i=0; i<6; i++){
            sum[i] = array1[i] + array2[i];
            System.out.println(sum[i]);
        }
    }
}
