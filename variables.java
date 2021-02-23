public class variables {
    public static void main(String[] args){
        int a = 3;
        //literals = used for representing the fixed values
        float myFloat = 3.4F;
        double myDouble = 3.4;
        double myDoubleScientific = 3.4e2; // = 3.44 * 10^2 = 3.44*100 = 344
        char letter = 'a';
        boolean flag1 = false;
        boolean flag2 = true;
        int binaryNumber = 0b10010; // 0b is zero not alphabet '0'
        int octalNumber = 027;
        int decNumber = 34;
        int hexNumber = 0x2F;
        String str1 = "Arjun S Pramod";
        byte b = 127;
        /*
        if b= 128: 
        error: incompatible types: possible lossy conversion from int to byte
            byte b = 128;
            ^
        1 error         */
        
        //pritning results    
        System.out.println(str1);
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(letter);
        System.out.println(a);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myDoubleScientific);
        System.out.println(binaryNumber);
        System.out.println(octalNumber);
        System.out.println(hexNumber);
        System.out.println(decNumber);
        System.out.println(b);
    }
    
}
