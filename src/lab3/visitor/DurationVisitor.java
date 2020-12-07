package lab3.visitor;

public class DurationVisitor implements Visitor{
    private float totalDuration=0;

    public String toString(){
        return "The visited elements have a total duration of: "
                + totalDuration + " min";
    }

    public void visit(Book book){
        totalDuration+= book.getNumberOfPages() * 5;
    }

    public void visit(Video video){
        totalDuration+=video.getTime() + video.getTime()/30*5;
    }

    public void visit(Audio audio){
        totalDuration+= audio.getTime() + audio.numberOfSongs * 0.3;
    }
}