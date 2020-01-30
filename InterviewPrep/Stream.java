import java.util.*;
import java.util.stream.*;

class Demo {
    public static void main(String args[]){
        List<Integer> number = Arrays.asList(2,3,3,7,4,5);

        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);
        List<Integer> sortsquare = number.stream().sorted().collect(Collectors.toList());
        System.out.println(sortsquare);
    }
}
