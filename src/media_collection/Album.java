package media_collection;

public class Album extends MediaItem {
    private String musician;
    private Integer numberOfTracks;

    public Album(String title, String producer, String musician, Integer numberOfTracks) {
        super(title, producer);
        this.musician = musician;
        this.numberOfTracks = numberOfTracks;
    }

    public String getMusician() {
        return musician;
    }
}
