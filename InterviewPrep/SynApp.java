
class Printer {
    void printDocuments( int numOfCopies, String docName){
        for (int i = 1; i<= numOfCopies; i++){
            System.out.println(">> Printing "+ docName+ "+i");
        }
    }
}


class MyThread extends Thread{
    Printer pRef;

    MyThread(Printer p){
        pRef =p;
    }

    @Override 
    public void run(){
        pRef.printDocuments(10, "my profile");
    }
}


public class SynApp{
    public static void main(String[] args){
        System.out.println("--application strat==");

        Printer printer = new Printer();
        MyThread mRef = new MyThread(printer);
        YourThread yRef = new YourThread(printer);
        mRef.start();
        System.out.println("application ended");;
    }

}