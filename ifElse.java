
public class ifElse {
    public static void main(String args[]){
        int number = 10;
        if(number>0){
            System.out.println("Positive number");
        }
        else if(number == 0){
            System.out.println("It's neither positive nor negative!");
        }
        else{
            System.out.println("Negative number");
        }
        System.out.println("This statement is always executed");
    }
}
