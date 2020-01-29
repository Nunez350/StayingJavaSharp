@FunctionalInterface
interface FunctionalStaticInterface{
    void interfaceMethod();
}

public class StaticMethodClass{
    public static void StaticMethodFunction(){
        System.out.println("calling this staic method");
    }
    

    public static void main(String [] args){
        FunctionalStaticInterface funobj = StaticMethodClass::StaticMethodFunction;
        funobj.interfaceMethod();
    }
}