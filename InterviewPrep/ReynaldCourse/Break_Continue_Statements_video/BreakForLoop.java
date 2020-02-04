  
  public class BreakForLoop {
    public static void main(String args[]){
        for ( int num2 = 0; num2 <11; num2++){
          System.out.println("var "+ num2);
          if ( num2 ==5){
            break;
          }
        }
        System.out.println("now we are out of the for loop");

    } 
    
  }