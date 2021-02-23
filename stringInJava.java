public class stringInJava {
    public static void main(String[] args){
        String greet = "Hello, Great day!";
        System.out.println(greet);
        //Length of the string!
        int length = greet.length(); //legth() is a method in here
        System.out.println(length);
        System.out.println(greet.length());
        System.out.println("Hello".length());
        System.out.println("Hello\n".length());// '\n' is a null character used at the end of the string
        //String concatenation
        String first = "Arjun S ";
        String second = "Pramod";
        System.out.println(first);
        System.out.println(second);
        String joinedString = first.concat(second);
        System.out.println(joinedString);
        //String comparing
        boolean result1 = first.equals(second);
        System.out.println(result1);
        String third = "Pramod";
        boolean result2 = second.equals(third);
        System.out.println(result2);
        //concat
        System.out.println(first.concat(third));
        //creating string using 'new' keyword
        String name2 = new String("Achaiah");
        System.out.println(name2);
        //escape characters
        String example = "This is the \"String\" class.";
    }
}
