import java.util.*;


class Subsequence {
    static boolean isSubsequence(String str1, String str2, int m, int n ){
        if(m ==0)
            return true;
        if(n==0)
            return true;
        if(str1.charAt(m-1)== str2.charAt(n-1))
            return isSubsequence(str1, str2, m-1, n-1);
        return isSubsequence(str1, str2, m, n-1);
    }

    public static void main(String[] args){
        String str1 = "gksrek";
        String str2 = "geeksforgeeks";
        int m = str1.length();
        int n = str2.length();
        boolean result = isSubsequence(str1, str2, m, n);
        if (result)
            System.out.println("yes");
        else System.out.println("no");
    }
}



