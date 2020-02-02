import java.io.*; 
import java.util.*;
import java.lang.*; 
class GrabDuplicates {


    
    public static void findDup(int arr []){
        // int length = arr.length;
        Set<Integer> set = new HashSet<Integer>(); 
        List<Integer> dups= new ArrayList<Integer>(Arrays.asList());
        for (int num : arr) { 
            if (set.add(num) == false) {
                
                dups.add( num);
                
               
            }

        }
        System.out.println(dups);
    }
    //    for ( int i =0; i < length; i++){
    //        System.out.println(arr[i]);
    //    }

    

    public static void main(String [] args){
        int arr []= {3,3,2,2,2,23};
        findDup(arr);
        
    }
}

// arr = arrlist.toArray(arr);