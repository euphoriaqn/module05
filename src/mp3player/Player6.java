package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player6 extends MainMp3{
    PlaylistOfSongs playlistPlayer6 = new PlaylistOfSongs();
    public Player6(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing " + playlistPlayer6.playlist[0]);
    }
}
