package lab2.ch2;

public class Spider extends Animal{
    public Spider(){
        super(8);
    }

    public void eat(){
        super.eat();
        System.out.print(" like a spider.");
    }
}
