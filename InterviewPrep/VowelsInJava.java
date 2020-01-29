import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class VowelsInJava {
    static String removeVowel(String strVowel){


        Character chVowels[] = {'a','e','i','o','A','E','I','O','U'};

        List<Character> li = Arrays.asList(chVowels);
        StringBuffer sb = new StringBuffer(strVowel);
        for(int a =0; a <sb.length(); a++){
            if(li.contains(sb.charAt(a))){
                sb.replace(a,a +1 ,"");
                a--;

                
            }
        }

        return sb.toString();
    }


    public static void main(String[] args){
        String strInput = "Flower brackets";
        System.out.println(removeVowel(strInput));
    }
}