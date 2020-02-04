/*Reynald  
write a Java program to take the last three characters from a given string and 
add the three characters at both the front and back of the string. 
String length must be greater than three and more.
Test data: "Python" will be "honPythonhon"
Sample Output:
honPythonhon*/

class Flipper{
    String Flipping(String input){
        String save =input.substring(input.length()-3);
        return save;
    }
}

class StringFlip{
    public static void main(String[] args) {
        String inputString="Python";
        Flipper st = new Flipper();
       String out= st.Flipping(inputString);
       System.out.println(out+inputString + out);
    }
}