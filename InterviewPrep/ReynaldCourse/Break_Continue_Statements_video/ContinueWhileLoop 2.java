public class ContinueWhileLoop{
   
    public static void main(String args[]){
        int number1 = 1;
        while (number1 < 11){
            if(number1 ==5){
                System.out.println("Midpoint at "+ number1);
                number1++;
                continue;
            }
            System.out.println("variable "+ number1);
            number1++;
        }
        System.out.println("We are out of the while loop");
    }

}