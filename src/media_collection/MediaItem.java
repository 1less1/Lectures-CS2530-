package media_collection;

public class MediaItem {
    // Both movies and albums have a title and a producer, which
    // are set when the object is created. They
    // can both be told to play (in which case we'll print the title
    // to standard output).
    //
    // Movies also have a director and a cast list.
    // Albums have a musician and a count of the number of tracks.
    private String title;
    private String producer;

    public MediaItem(String t, String p) {
        title = t;
        producer = p;
    }

    public void play() {
        System.out.println("Playing " + title);
    }

    public String getTitle() {
        return title;
    }
}
