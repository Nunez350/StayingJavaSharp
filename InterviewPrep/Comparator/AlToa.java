import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlToa {
  public static void main(String[] args) {
    ArrayList<String> stringList = new ArrayList<>();

    stringList.add("ASS");
    stringList.add("Ba");
    stringList.add("DaS");
    stringList.add("AddS");
    stringList.add("ASdd");

    System.out.println("Before sort" + stringList);

    Collections.sort(stringList, new SortComparator());

  System.out.println("after sort" + stringList);
}
}


//https://www.youtube.com/watch?v=dRX6qO46l44&t=250s