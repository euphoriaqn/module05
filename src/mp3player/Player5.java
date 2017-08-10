package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player5 extends MainMp3{
    PlaylistOfSongs playlistPlayer5 = new PlaylistOfSongs();
    public Player5(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing " + playlistPlayer5.playlist[0]);
    }
    public void playAllSongs(){

    }
}
