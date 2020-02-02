import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Map.Entry;

class GrabDuplicatesWHashMap {

    public static void Store(int arr[]){


        Map<Integer, Integer> nameNCount = new HashMap<>();
        for (Integer num : arr) {
            Integer count = nameNCount.get(num);
            if ( count == null){
                nameNCount.put(num,1);
            }else {
                nameNCount.put(num, ++count);
            }

        }

        Set<Entry<Integer, Integer>> entrySet = nameNCount.entrySet();
        for (Entry<Integer, Integer> entry :entrySet){
        //     System.out.println(entry.getKey());l 
        //   System.out.println(entry.getValue());
          System.out.printf(" element %s and count '%d' :", entry.getKey(), entry.getValue()); 
          System.out.println("");
        }
        System.out.println(nameNCount);
        System.out.println(nameNCount.get(2));
    }


    public static void main(String [] args){

        int arr []= {3,3,2,2,2,23,44};
        Store(arr);
        
    }

}



//  for (String name : names) { 
//      Integer count = nameAndCount.get(name); 
//      if (count == null) { nameAndCount.put(name, 1); 
//     } else { nameAndCount.put(name, ++count); 
//     } } // Print duplicate elements from array in Java 
//     Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet(); 
//     for (Entry<String, Integer> entry : entrySet) { 
//         if (entry.getValue() > 1) { 
//             System.out.printf("duplicate element '%s' and count '%d' :", entry.getKey(), entry.getValue()); } }
