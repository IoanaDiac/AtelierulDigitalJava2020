// Exemplu consta in crearea unui folder cu muzica in care se adauga pe rand mai multe stiluri si derivate din acestea, fiind mai apoi completate cu diferite piese

package Project1.Composite;public class Main {
    public static void main(String[] args) {
        PlaylistComponent rock=new Style("ROCK");
        PlaylistComponent folk=new Style("FOLK");
        PlaylistComponent pop = new Style("POP");
        PlaylistComponent softRock = new Style("Soft Rock");
        PlaylistComponent hardRock = new Style("Hard rock");
        PlaylistComponent allPlaylists =new Style("MUSIC FOLDER");

        allPlaylists.add(rock);
        allPlaylists.add(folk);
        allPlaylists.add(pop);

        folk.add(new Track("folk 1 ","singer1"));
        pop.add(new Track("pop 1","singer4"));

        rock.add(softRock);
        rock.add(hardRock);

        hardRock.add(new Track("HR 1","singer2"));
        softRock.add(new Track("SR 1","singer3"));
        folk.add(new Track("folk 2 ","singer1"));
        folk.add(new Track("folk 3 ","singer5"));
        pop.add(new Track("pop 2","singer6"));

        allPlaylists.print();

    }


}
