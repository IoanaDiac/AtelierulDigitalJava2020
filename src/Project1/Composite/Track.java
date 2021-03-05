package Project1.Composite;

public class Track extends PlaylistComponent{

    String name;
    String singer;


    public Track(String name, String singer) {
        this.name = name;
        this.singer = singer;

    }


    public String getName() {
        return name;
    }


    public String getSinger() {
        return singer;
    }



    public Object createIterator() {
        return new NullIterator();
    }

    public void print() {
        System.out.print("  " + getName());

        System.out.println(" - " + getSinger());

    }

}
