package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player2 extends MainMp3 {

    public Player2(int price) {
        super(price);
        System.out.println("Об'єкт Player2 создан");
    }

    @Override
    public void playSong() {
        System.out.println("error!!!");
    }
}
