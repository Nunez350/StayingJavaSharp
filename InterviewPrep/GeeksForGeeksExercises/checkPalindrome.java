public class checkPalindrome {

    static boolean isPalindrome(String str){
        int i =0, j = str.length() -1;
        while (i <j){
            if(str.charAt(i) != str.charAt(j))
                return false;
                i++;
                j--;
        }

        return true;

    }

    public static void main(String[] args){
        String str = "geeks";
        if((isPalindrome(str)))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
//https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/