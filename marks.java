import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        int numStudents, counter, grade, total, average;
        Scanner console = new Scanner(System.in);
        total = 0;
        counter = 1;
        System.out.println("Enter the number of students:");
        numStudents = console.nextInt();
        while (counter <= 10) {
            System.out.println("Enter a grade: ");
            grade = console.nextInt();
            total = total + grade;
            counter = counter + 1;
        }
        average = total / counter;
        System.out.println("Class average is: " + average);
    }
}