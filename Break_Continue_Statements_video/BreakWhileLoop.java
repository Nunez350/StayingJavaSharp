
public class BreakWhileLoop {
   public static void main(String args[]){
         int num1 = 1;
         while ( num1 < 11){
            if (num1 >5){
               break;
            }
            System.out.println("variable "+ num1);
            num1++;
         }
         System.out.println("Broke out of while loop");
     }
}
