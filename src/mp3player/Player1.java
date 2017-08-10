package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player1 extends MainMp3 {
        Song song = new Song();
        public Player1(int price) {
        super(price);
        System.out.println("Об'єкт Player1 создан ");
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + song.song1);
    }
}
