package mp3player;
import java.util.Random;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player6 extends ManyFunctionalPlayer{
    public Player6(int price) {
        super(price);
        System.out.println("Об'єкт Player6 создан");
    }

    @Override
    public void playSong() {
        System.out.println("Playing " + playlist[0]);
    }
    public void shuffle(){
        Random rnd = new Random();
        for (int i = playlist.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String tmp = playlist[index];
            playlist[index] = playlist[i];
            playlist[i] = tmp;
        }
    }
}
