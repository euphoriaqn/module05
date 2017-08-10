package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player3 extends MainMp3{
    PlaylistOfSongs playlistPlayer3 = new PlaylistOfSongs();
    public Player3(int price) {
        super(price);
        System.out.println("Об'єкт Player3 создан");
    }

    @Override
    public void playSong() {
        System.out.println("Playing " + playlistPlayer3.playlist[0]);
    }

}
