/*Write a Java program that has the following:
1. Shows the use of interfaces to pass method signatures and variables
2. Uses multiple inheritance of the interfaces
3. Shows multiple interfaces being implemented in classes
4. Shows both class inheritance and interface being used

*interface extends multiple interfaces
*atleast 3 interfaces
*/
class InterfaceExample2 extends InterfaceJavaExample{
    public static void main(String[] args) {
        InterfaceJavaExample example = new InterfaceJavaExample();
        example.print();
        example.show();
        System.out.println(num3+num1);
    }
}

class InterfaceJavaExample implements Showable, Number1{
    public void print(){System.out.println("Hello! :) I am " + num1 + " years old!");}
    public void show(){System.out.println("I am showing!"+num1);}
}



interface Printable{
     void print();

}
interface Showable extends Printable {
    void show();
    int num3 = 35;
}

interface Number1{
    int num1 = 40;
}