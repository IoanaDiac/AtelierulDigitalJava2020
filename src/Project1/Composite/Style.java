package Project1.Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Style extends PlaylistComponent{
    ArrayList playlistComponent = new ArrayList();
    String name;

    public Style(String name) {
        this.name = name;
    }


    public void add(PlaylistComponent playlistComponent) {
        this.playlistComponent.add(playlistComponent);
    }


    public void remove(PlaylistComponent playlistComponent) {
        this.playlistComponent.remove(playlistComponent);
    }


    public PlaylistComponent getChild(int i) {
        return (PlaylistComponent)this.playlistComponent.get(i);
    }


    public String getName() {
        return name;
    }


    public Iterator createIterator() {
        return new
                CompositeIterator(playlistComponent.iterator());
    }




    public void print() {
        System.out.print("\n" + this.getName() + "\n");

        System.out.println("---------------------");
        Iterator iterator = this.playlistComponent.iterator();

        while(iterator.hasNext()) {
            PlaylistComponent playlistComponent =
                    (PlaylistComponent) iterator.next();
            playlistComponent.print();
        }
    }
}
