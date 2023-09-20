package media_collection;

import java.util.ArrayList;

public class MediaCollection {
    // A MediaCollection starts empty. It can be given media items (albums and movies)
    // and it can play the same. Each time a media item is played, the collection
    // increments a count of the number of times played.

    // Notice that this list holds elements of type 'MediaItem'. I can put elements
    // of type Album or Movie here, since both of these can "take the form of" a
    // MediaItem. This is **polymorphism**.
    //private ArrayList<MediaItem> collection = new ArrayList<>();
    //private ArrayList<Integer> playCount = new ArrayList<>();
    private ArrayList<MediaItemRecord> collection = new ArrayList<>();

    public void addItem(MediaItem m) {
        collection.add(new MediaItemRecord(m));
    }

    public void playItemByTitle(String title) {
        // Go through the collection until you find the item with the given 'title' and
        // tell it to play.
        for(MediaItemRecord m : collection) {
            if(m.getMediaItem().getTitle().equals(title)) {
                m.getMediaItem().play();
                m.incrementCount();
            }
        }
    }

    public void playByMusician(String musician) {
        for(MediaItemRecord m : collection) {
            if(m.getMediaItem() instanceof Album) {
                Album a = (Album) m.getMediaItem();
                if(a.getMusician().equals(musician)) {
                    a.play();
                }
            }
        }
    }

    // We are looking for a way to keep a count of the number of times
    // each media item has been played. We want to group these logically-related
    // pieces of information (MediaItem and count of number of plays) together.
    // We can do that by putting these two pieces of information together into their
    // own "private inner class".
    private class MediaItemRecord {
        private MediaItem mediaItem;
        private Integer playCount = 0;

        public MediaItemRecord(MediaItem m) {
            mediaItem = m;
        }

        public MediaItem getMediaItem() {
            return mediaItem;
        }

        public void incrementCount() {
            playCount = playCount + 1;
        }

        public Integer getPlayCount() {
            return playCount;
        }
    }
}
