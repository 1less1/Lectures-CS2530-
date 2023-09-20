package media_collection;

public class MediaDriver {
    public static void main(String[] args) {
        MediaCollection mc = new MediaCollection();

        Album a1 = new Album("Album Title 1", "Producer 1",
                "Musician 1", 10);
        Movie m1 = new Movie("Movie Title 1", "Producer 2",
                "Director 1", "Cast List 1");

        // Notice that addItem expects an object of type MediaItem. a1 is an
        // Album and m1 is a Movie, but both albums and movies are considered
        // MediaItems, so this "substitution" works (polymorphism)
        mc.addItem(a1);
        mc.addItem(m1);

        mc.playItemByTitle("Album Title 1");
    }
}
