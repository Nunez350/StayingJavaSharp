
import java.text.ParseException;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
public class HashMapSorting {

    public static void main(String args[]) throws ParseException {
        
        // let's create a map with Java releases and their code names
        HashMap<String, String> codenames = new HashMap<String, String>();
        
        codenames.put("JDK 1.1.4", "Sparkler");
        codenames.put("J2SE 1.2", "Playground");
        codenames.put("J2SE 1.3", "Kestrel");
        codenames.put("J2SE 1.4", "Merlin");
        codenames.put("J2SE 5.0", "Tiger");
        codenames.put("Java SE 6", "Mustang");
        codenames.put("Java SE 7", "Dolphin");
        
        System.out.println("HashMap before sorting, random order ");
        Set<Entry<String, String>> entries = codenames.entrySet();
       
        for(Entry<String, String> entry : entries){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }

        TreeMap<String, String> sorted = new TreeMap<>(codenames);
        Set<Entry<String, String>> mappings = sorted.entrySet();
        
        System.out.println("HashMap after sorting by keys in ascending order ");
        for(Entry<String, String> mapping : mappings){
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }
    }
}


// TreeMap<Integer, Integer> sortedtr = new TreeMap<Inteer,Integer>(codenames);
// Set<Entry<Integer, Integer>> newset = sortedtr.entrySet();
