package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player3 extends ManyFunctionalPlayer{

    public Player3(int price) {
        super(price);
        System.out.println("Об'єкт Player3 создан ");
    }


    @Override
    public void playSong() {
        System.out.println("Playing " + playlist[0]);
    }

}

