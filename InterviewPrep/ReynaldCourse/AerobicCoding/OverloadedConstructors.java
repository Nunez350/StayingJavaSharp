/*Create a program that utilizes each of the following to set and output attributes of an object(s):
Overloaded object constructors
Overloaded class methods
The “this” keyword
At least one static method
Make sure that each is used at least once in the program. 
The output should demonstrate the effects of each constructor and method call.*/
class OverloadedConstructors{
    int fine;
    OverloadedConstructors(){
        fine = 1;
    }

    OverloadedConstructors(){
      fine=2;
        //  System.out.println("fine2");
    }




    public static void main(String[] args) {
        OverloadedConstructors myobj1 = new OverloadedConstructors();
        OverloadedConstructors myobj2 = new OverloadedConstructors();
        
    }
    }
   
}
