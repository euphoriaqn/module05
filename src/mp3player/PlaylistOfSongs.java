package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class PlaylistOfSongs {
    Song song = new Song();
    String[] playlist = new String[]{song.song1, "Good song", "Super Song" };
    public void playAllSongs(){
        for (String songCount : playlist){
            System.out.println("Playing " + songCount);
        }
    }
    public void playAllSongsInverse(){

    }
    public void shuffle(){

    }
}
