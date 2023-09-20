package media_collection;

public class Movie extends MediaItem {
    // Movies also have a director and a cast list.
    private String director;
    private String castList;

    public Movie(String t, String p, String d, String cL) {
        super(t, p);
        director = d;
        castList = cL;
    }
}
