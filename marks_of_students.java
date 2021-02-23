import java.util.Scanner;
public class marks_of_students {
    public static void main(String[] args) {
        System.out.println("Enter the marks of three subjects: ");
        Scanner sc = new Scanner(System.in);
        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        if (m1 > 100 || m2 > 100 || m3 > 100) {
            System.out.println("Marks entered should not exceed 100");
        } else {
            double total = m1 + m2 + m3;
            double average = (total * 10) / 300;
            char grade;
            if (average >= 9 && average <= 10) {
                grade = 'A';
            } else if (average >= 8 && average < 9) {
                grade = 'B';
            } else if (average >= 7 && average < 8) {
                grade = 'C';
            } else if (average >= 6 && average < 7) {
                grade = 'D';
            } else if (average >= 5 && average < 6) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            System.out.println("Total marks scored: " + total);
            System.out.println("Grade: " + grade);
        }

    }

}
