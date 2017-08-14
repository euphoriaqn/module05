package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player4 extends ManyFunctionalPlayer{

    public Player4(int price) {
        super(price);
        System.out.println("Об'єкт Player4 создан ");
    }

    @Override
    public void playSong() {
        System.out.println("Playing " + playlist[playlist.length-1]);
    }
}
