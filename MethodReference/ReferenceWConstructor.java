@FunctionalInterface
interface ConstructorInterface{
    MyConstruct getIt(String m);
}

class MyConstruct{
    MyConstruct(String m){
        System.out.println("Get"+m);
    }
}

public class ReferenceWConstructor{
    public static void main(String [] args){
        ConstructorInterface CIobj =MyConstruct::new;
        CIobj.getIt("It!");
        CIobj.getIt("got");
    }
}