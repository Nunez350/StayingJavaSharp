 public class ContinueForLoop {
   
    public static void main(String args[]){
     
     int num2 = 1;
     while (num2 < 11) {
        if (num2 == 5) {
            System.out.println( "Midpoint at " + num2 );
            num2++;
           continue;
      /* Control will return to beginning of while loop for next 
           iteration*/
        }
      System.out.println("variable = " + num2);
        num2++;
    }
    System.out.println("Out of while-loop (Continue example)"+'\n');
}