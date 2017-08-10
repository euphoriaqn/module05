package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player4 extends MainMp3{
    PlaylistOfSongs playlistPlayer4 = new PlaylistOfSongs();
    public Player4(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing " + playlistPlayer4.playlist[playlistPlayer4.playlist.length-1]);
    }
}
