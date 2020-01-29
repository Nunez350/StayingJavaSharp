import java.io.*;

class Subsequence {


    static boolean isSubSeq(String str1, String str2, int a, int b){
        if (a == 0)
            return true;
        if (b == 0)
            return false;
        
        if (str1.charAt(a-1)== str2.charAt(b-1))
            return isSubSeq(str2, str2, a-1, b-1);
        return isSubSeq(str2, str2, a, b-1);

    }


    public static void main(String [] args){
        String str1 = "gksrek";
        String str2 = "geeksforgeeks";
        int a = str1.length();
        int b = str2. length();

         boolean result = isSubSeq(str1, str2, a, b);

        if (result)
            System.out.println("yes");
        else 
            System.out.println("no");
    }
}