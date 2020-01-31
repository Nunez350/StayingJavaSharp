class FindSecondLargest {

    public static void printSecondLargets(int arr[], int arraySize){

        int largest, secondL;
        
        largest = secondL=Integer.MIN_VALUE;


        for ( int i =0; i < arraySize ; i++){

            if ( arr[i] > largest){
                secondL = largest;
                largest = arr[i];
            } else if ( arr[i] > secondL && arr[i] == largest){
                secondL =arr[i];
            }
        }
        System.out.println(secondL);

    }

    public static void main(String [] args){
        int arr [] = { 12,44,55,333,555,-4444};
        int arraySize = arr.length;

        printSecondLargets(arr, arraySize);
    }
}