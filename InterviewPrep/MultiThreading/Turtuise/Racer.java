public class Racer implements Runnable {
    public static String winner;
    public void race(){
        for(int distance=1; distance<=100; distance++){
            System.out.println("Distance covered by " + Thread.currentThread().getName() + "is "+ distance + " meters ");
            
            if(distance == 30 && Thread.currentThread().getName().equals("Hare")){
                try {
                    System.out.println(Thread.currentThread().getName()+"is sleeeping ...");
                    Thread.sleep(100 *10);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            boolean isRaceWon = this.isRaceWon(distance);
            if(isRaceWon){
                break;
            }
        }
    }

int winnerWins = 0;



private boolean isRaceWon(int totalDistanceCovered){
    boolean isRaceWon = false;
    if((Racer.winner == null) && (totalDistanceCovered==100)){
        String winnerName = Thread.currentThread().getName();
        Racer.winner = winnerName;
        System.out.println("Winner is " + Racer.winner);
        isRaceWon = true;
        //Racer.winner.equals(hare)  ? winnerWins +1 : winnerWins;
    } else if (Racer.winner==null){
        isRaceWon = false;
    } else if(Racer.winner != null){
        isRaceWon = true;
    }
    return isRaceWon;
}
    @Override
    public void run() {
       this.race();
        
    }
}
