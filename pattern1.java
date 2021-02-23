public class pattern1 {
    public static void main(String[] args) {
        short r, c, k = 1;
        for (r = 1; r <= 3; r++) {
            for (c = 1; c <= r; c++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
