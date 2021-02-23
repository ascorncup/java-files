public class asterickBorderPattern {
    public static void main(String[] args) {
        int r, c;
        for (r = 1; r <= 4; r++) {
            for (c = 1; c <= 4; c++) {

                if (r == 1 || c == 4 || r == 4 || c == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
