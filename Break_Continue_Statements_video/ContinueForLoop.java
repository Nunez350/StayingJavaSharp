public class ContinueForLoop {
    public static void main(String args[]){
        for ( int number2=0; number2 <11; number2++){
            if(number2 == 5){
                System.out.println("Midpoint at :" +number2);
                continue;
            }
            System.out.println("variable " +number2);
        }
        System.out.println("We are out of the for loop");
    }
}