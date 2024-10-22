package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public Iterator getSequentialIterator() {
        return new SequentialIterator(songs);
    }

    public Iterator getShuffleIterator() {
        return new ShuffleIterator(songs);
    }

}

