import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

class CallableEx implements Callable {
    public static void demoFutureWithCallable() throws InterruptedException, ExecutionException {
        System.out.println();
        System.out.println("Demo future with callable");

        ExecutorService pool = Executors.newCachedThreadPool();
        
        Callable<Pizza> task = () -> {
            System.out.println(" Restaurant > slicing tomators");
            System.out.println(" Restaurant > chopping onions");
            System.out.println(" Restaurant > Spreading with tomato sauce and sprinkle with toppings");
            System.out.println(" Restaurant > Naking pizza");
    
            TimeUnit.MILLISECONDS.sleep(300);
            Pizza pizza = new Pizza();
            return pizza;
        };
       
        Future <Pizza> pizzaOrderPickup = pool.submit(task);

        System.out.println("me: call my brother");;
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println("Me; walk the dog");
        
        Pizza pizza = pizzaOrderPickup.get();
        System.out.println("Me: eat the pizza " + pizza);

        pool.shutdown();

        System.out.println();
     }

     public static class Pizza {

     }

    @Override
    public Object call() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}