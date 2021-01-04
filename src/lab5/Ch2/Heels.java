package lab5.Ch2;

public class Heels implements Shoe{
    private String color;
    private String size;

    public Heels(String color, String size) {
        this.color = color;
        this.size = size;
    }
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSize() {
        return size;
    }
}
