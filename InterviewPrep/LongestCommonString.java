

class LongestCommonString {

    public static String findRoot(String arr[]){
        int arrayLength  = arr.length;
        String refString = arr[0];
        int refStringLength = refString.length();
        
        String stringResult="";

        for ( int i =0; i < refStringLength; i++){
            for ( int j = i+1; j <= refStringLength; j++){
                String stem = refString.substring(i,j);
                int k =1;
                for (k =1; k<arrayLength; k++)
                    if(!arr[k].contains(stem))
                        break;
                if( k==arrayLength && stringResult.length() < stem.length())
                stringResult =stem;
            }
        }
        return stringResult;
    }

    public static void main(String args[]) 
    { 
        String arr[] = { "grace", "graceful", "disgraceful",  
                                            "gracefully" }; 
        String stems = findRoot(arr); 
        System.out.println(stems); 
    } 
} 