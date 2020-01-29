import java.util.*; 


public class LinkedListClass { 
    public static void main(String args[]) { 
// Creating object of class linked list 
        LinkedList<String> object = new LinkedList<String>(); 
  
    // 1) Adding elements to the linked list 
        object.add("A"); 
        object.add("B");
        object.add("C");  
        object.add("D"); 
        object.add(3,"d");
        //System.out.println("Linked list : " + object);


    // 2) Removing elements from the linked list 
        object.remove("D");
        object.remove(3);
        //System.out.println("Linked list after deletion: " + object); 


    // 3)  Finding elements in the linked list 
         boolean status = object.contains("E"); 
  
         if(status) 
          System.out.println("List contains the element 'A' "); 
             else
           System.out.println("List doesn't contain the element 'E'"); 
  
    //  4) Number of elements in the linked list 
           int size = object.size(); 
           System.out.println("Size of linked list = " + size); 
  
    //  5) Get and set elements from linked list 
            Object element = object.get(2); 
            System.out.println("Element returned by get() : " + element); 
          object.set(2, "Y"); 
          System.out.println("Linked list after change : " + object); 
     } 
} 