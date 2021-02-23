public class breakDemo {
    public static void main(String[] args){
        int i=1;
        while(i<25){
            
            if(i<10){
                System.out.println("Using continue: i="+(i++));
                continue;
            }
            else{System.out.println("i = "+ (i++));}
            
        }
    }
}
