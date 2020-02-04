
/*
 1. Create a class and an Interface
//
//  2. The interface has a nested interface
//
//  3. Both the nested and regular interface have methods with an output message
//
//  4. Create a static class in the first class
//  with a method that has an output message.
//
//  5. The main calls the satic class message
//  and uses Anonymous Inner class to implement the two
//  interfaces and call the two output messages.
// Output
// Static Nested Class from main
// Anonymous Interface from main
// Anonymous Nested Interface from main
*/

interface IAerobic {
   void interfaceMsg();
   interface Nested_IAerobic {
       void nested_IAerobic_Msg();
   }
}
class GregAerobic {
   static class Inner {
       static void msg() {
           System.out.println("Static Nested Class from main");
       }
   }    
   public static void main(String[] args) {
        GregAerobic.Inner.msg();
        IAerobic iAerobic = new IAerobic() {
            Nested_IAerobic nested_IAerobic = new Nested_IAerobic(){// how were we able to access the nested interface??
                public void nested_IAerobic_Msg() {
                    System.out.println("Anonymous Nested Interface from main7");
                }
            };
            public void interfaceMsg() {
                System.out.println("Anonymous Interface from main");
                nested_IAerobic.nested_IAerobic_Msg();
            }
        };
       iAerobic.interfaceMsg();
   }
}