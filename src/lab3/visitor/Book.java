package lab3.visitor;

public class Book implements Element{
    private int numberOfPages;
    private String name;

    public String getName() {
        return name;
    }

    public Book(int numberOfPages, String name) {
        this.numberOfPages = numberOfPages;
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void accept(Visitor v){v.visit(this);}
}