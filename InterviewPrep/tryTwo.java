import java.text.ParseException;
import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.LinkedHashMap;
// import java.util.List;
// import java.util.Map.Entry;
// import java.util.Set;
// import java.util.TreeMap;
import java.util.Map.Entry;


class tryTwo {


        public static void main(String [] args){

            HashMap<String, String> codenames = new HashMap<String, String>();

            codenames.put("JDK 1.1.4", "Sparkler");
            codenames.put("J2SE 1.2", "Playground");
            codenames.put("J2SE 1.3", "Kestrel");
            codenames.put("J2SE 1.4", "Merlin");
            codenames.put("J2SE 5.0", "Tiger");
            codenames.put("Java SE 6", "Mustang");
            codenames.put("JAva SE 7", "Dolphin");

            System.out.println("HashMap before sorting, random order ");
            for(Entry<String, String> entry : entries){
                System.out.println(entry.getKey() + " ==> " + entry.getValue());
            }


        }

}