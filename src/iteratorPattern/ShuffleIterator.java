package iteratorPattern;

import java.util.Collections;
import java.util.List;

public class ShuffleIterator implements Iterator {
    private List<Song> songs;
    private int position;

    public ShuffleIterator(List<Song> songs) {
        this.songs = songs;
        Collections.shuffle(songs);
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
