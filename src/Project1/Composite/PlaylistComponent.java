package Project1.Composite;

public abstract class PlaylistComponent  {



        public void add(PlaylistComponent playlistComponent) {
            throw new UnsupportedOperationException();
        }

        public void remove(PlaylistComponent playlistComponent) {
            throw new UnsupportedOperationException();
        }

        public PlaylistComponent getChild(int i) {
            throw new UnsupportedOperationException();
        }

        public String getName() {
            throw new UnsupportedOperationException();
        }

        public String getSinger() {
            throw new UnsupportedOperationException();
        }



        public abstract Object createIterator();

        public void print() {
            throw new UnsupportedOperationException();
        }
    }

