package lab5.Ch2;

public class Running implements Shoe{
    private String color;
    private String size;

    public Running(String color, String size) {
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
