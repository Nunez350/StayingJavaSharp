//Import java util library
import java.util.ArrayList;


class ArrayLists{
public static void main(String[] args){
    //Declaring an array object of the ArrayList class
    ArrayList<String> lunch = new ArrayList<String>(2);

    //adding objects to an array 
    lunch.add("Fajitas");
    lunch.add("Pizza");
    lunch.add("Mangu");
    lunch.add("Mexican wrap");
    lunch.add("Cheeseburge");
    lunch.add("Fish sandwich");

     //printing out array
     System.out.println(lunch);
    System.out.println(lunch.get(1));
        
   //remove an element
    lunch.remove(4);
    System.out.println(lunch); 

    //replace an element
    lunch.set(1,"salad");
    System.out.println(lunch);
    //combing get and equals methods 
    if ( lunch.get(0).equals("Fajitas")){
        System.out.println(" we are having fajitas today!");
    }
   
    //retrieving array size
    System.out.println(lunch.size());
       
    //clear array
    lunch.clear();
    System.out.println(lunch);
    }
}

