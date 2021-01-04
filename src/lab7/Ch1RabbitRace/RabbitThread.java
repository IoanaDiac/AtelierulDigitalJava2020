package lab7.Ch1RabbitRace;

public class RabbitThread extends Thread{
    private int nr;

    public  RabbitThread(int nr){
        this.nr=nr;
    }
    @Override
    public void run(){
        System.out.printf("Rabbit %s is running \n",nr);
    }
}
