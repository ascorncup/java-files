import java.util.Scanner;
public class area {
    //double l,b,he,ba,r,pi=3.14;
    public static void Circle()
    {
        System.out.println("Enter the radius of the circle:");
        double r = s.nextDouble();
        double pi = 3.14;
        double areaCircle = pi*r*r;
        System.out.println("The area of circle is :"+ areaCircle);
    }
    public static void Rectangle()
    {
        System.out.println("ENter the length of the rectangle:");
        double l= s.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double b=s.nextDouble();
        double areaRect = l*b;
        System.out.println("The area of rectangle is:"+areaRect);
    }
    public static void Triangle()
    {
        System.out.println("Enter the base of the triangle:");
        double ba = s.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double he = s.nextDouble();
        double areaTri = 0.5*(ba*he);
        System.out.println("The area of the triangle is:"+areaTri);
    }
    public static void Square()
    {
        System.out.println("Enter the side of the square:");
        double side = s.nextDouble();
        double areaSquare = side*side;
        System.out.println("The area of the square is :"+ areaSquare);
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the choice: \n1) AREA of circle \n2) AREA of Triangle \n3)AREA of Rectangle \n4) AREA of Square");
        int choice = s.nextInt();
        /*switch(choice){
            case 1 : System.out.println("You can find area of Circle here");
            Circle(); 
        }*/
        if(choice=='1'){
            Circle();
        }
        else if(choice=='2'){
                Triangle();
        }
        else if(choice=='3'){
                Rectangle();
        }
        else if(choice=='4'){
                Square();
        }
        else{
            System.out.println("Enter choice between 1 to 4");
        }
     }

}

