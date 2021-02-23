import java.util.Scanner;

public class areaOfDifferentShapes {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "Enter the choice: \n1) Area of Triangle \n2) Area of Rectangle \n3)Area of Trapezoid \n4)Exit");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the length of the rectangle:");
                double l = s.nextDouble();
                System.out.println("Enter the breadth of the rectangle:");
                double b = s.nextDouble();
                double areaRect = l * b;
                System.out.println("The area of rectangle is:" + areaRect);
                break;
            case 2:
                System.out.println("Enter the base of the triangle:");
                double ba = s.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double he = s.nextDouble();
                double areaTri = 0.5 * (ba * he);
                System.out.println("The area of the triangle is:" + areaTri);
                break;
            case 3:
                System.out.println(" Please Enter First Base of a Trapezoid =  ");
                double base1 = s.nextDouble();
                System.out.println(" Please Enter Second Base of a Trapezoid =  ");
                double base2 = s.nextDouble();
                System.out.println(" Please Enter the Height of a Trapezoid = ");
                double height = s.nextDouble();
                double areaTrap = 0.5 * (base1 + base2) * height;
                System.out.format("\n The Area of a Trapezoid = %.2f\n", areaTrap);
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Wrong choice!");
        }
    }
}

/*
 * if(choice=='1'){ Triangle(); } else if(choice=='2'){ Rectangle(); } else
 * if(choice=='3'){ Trapezoid(); } else{ System.out.println("Wrong choice"); } }
 */
/*
 * public static void Rectangle() {
 * System.out.println("Enter the length of the rectangle:"); double l =
 * s.nextDouble(); System.out.println("Enter the breadth of the rectangle:");
 * double b = s.nextDouble(); double areaRect = l * b;
 * System.out.println("The area of rectangle is:" + areaRect); }
 * 
 * public static void Triangle() {
 * System.out.println("Enter the base of the triangle:"); double ba =
 * s.nextDouble(); System.out.println("Enter the height of the triangle:");
 * double he = s.nextDouble(); double areaTri = 0.5 * (ba * he);
 * System.out.println("The area of the triangle is:" + areaTri); }
 * 
 * public static void Trapezoid() {
 * System.out.println(" Please Enter First Base of a Trapezoid =  "); double
 * base1 = s.nextDouble();
 * System.out.println(" Please Enter Second Base of a Trapezoid =  "); double
 * base2 = s.nextDouble();
 * System.out.println(" Please Enter the Height of a Trapezoid = "); double
 * height = s.nextDouble(); double areaTrap = 0.5 * (base1 + base2) * height;
 * System.out.format("\n The Area of a Trapezoid = %.2f\n", areaTrap); }
 */
