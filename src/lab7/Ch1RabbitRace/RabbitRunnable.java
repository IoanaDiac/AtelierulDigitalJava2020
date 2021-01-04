package lab7.Ch1RabbitRace;

public class RabbitRunnable implements Runnable{
    private int nr;

    public RabbitRunnable(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.printf("Rabbit %s is running \n", nr);
    }
}
