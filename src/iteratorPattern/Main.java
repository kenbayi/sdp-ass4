package iteratorPattern;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Song 1", "Rock"));
        playlist.addSong(new Song("Song 2", "Pop"));
        playlist.addSong(new Song("Song 3", "Rock"));
        playlist.addSong(new Song("Song 4", "Jazz"));

        System.out.println("Sequential order:");
        Iterator sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next().getTitle());
        }

        System.out.println("\nShuffle order:");
        Iterator shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next().getTitle());
        }
    }
}

