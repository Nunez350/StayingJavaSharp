 public class ContinueWhileLoop {
   
    public static void main(String args[]){
     
      for(int num =1; num <11; num++){
        if(num==5){
          System.out.println("Midpoint at "+num);
          continue;
         /*will not execute the rest of the for-loop on this iteration */
          }
            System.out.println("variable = "+num);
      }
    }
    System.out.println("Out of while-loop (Continue example)"+'\n');
}