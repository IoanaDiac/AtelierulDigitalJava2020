package lab3.visitor;

public class Video implements Element{
    private String name;
    private int time;

    public Video(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}