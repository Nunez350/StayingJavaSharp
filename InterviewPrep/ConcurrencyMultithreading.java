
class MyTask extends Thread{
    @Override
    public void run(){
        for(int doc=1; doc <=10; doc++){
            System.out.println("@@ printing document #"+ doc+ "Printer2");
        }
    }
}
public class ConcurrencyMultithreading {
    public static void main(String[] args){
        System.out.println("==application started==");
        MyTask task = new MyTask();
        task.start();

        for (int doc=1; doc<=10; doc++){
            System.out.println("^^ Printing document #" + doc +"-printer 1");
        }

    }
}

// public class ConcurrencyMultithreading extends Thread {
//     public void run(){
//         System.out.println("thread");
//     }
//     public static void main(String[] args){
//         ConcurrencyMultithreading obj = new ConcurrencyMultithreading();
//         obj.start();
//     }
// }


//in the thread class 
//we overdie the run method. 
//create an object of the class. 
//invoked the satrt method to execture the custome threads run

//in the running interface you create a thread class that implements the runnable interface
//overide the run method
//create an object of the class
//invoked the start method using the object


// public class ConcurrencyMultithreading implements Runnable{
//     public void run(){
//         System.out.println("run thread");
//     }
//     public static void main(String [] args){
//         Thread t = new Thread(new ConcurrencyMultithreading());
//         t.start();
//     }
// }