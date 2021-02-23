import java.util.Scanner;

public class gradingOfStudents {
    public static void main(String[] args) {
        System.out.println("Enter the grade in numbers: ");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        switch (grade / 10) {
            case (10):
                System.out.println("Perfect score");
                break;
            case (9):
                System.out.println("Excellent");
                break;
            case 8:
                System.out.println("Good");
                break;

            case 7:
                System.out.println("Above average");
                break;

            case 6:
                System.out.println("Average");
                break;

            case 5:
                System.out.println("Below average");
                break;

            default:
                System.out.println("Not passing");
        }

        /*
         * if (m1 > 100 || m2 > 100 || m3 > 100) {
         * System.out.println("Marks entered should not exceed 100"); } else { double
         * total = m1 + m2 + m3; double average = (total * 10) / 300; char grade; if
         * (average >= 9 && average <= 10) { grade = 'A'; } else if (average >= 8 &&
         * average < 9) { grade = 'B'; } else if (average >= 7 && average < 8) { grade =
         * 'C'; } else if (average >= 6 && average < 7) { grade = 'D'; } else if
         * (average >= 5 && average < 6) { grade = 'E'; } else { grade = 'F'; }
         * System.out.println("Total marks scored: " + total);
         * System.out.println("Grade: " + grade); }
         */

    }

}
