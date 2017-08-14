package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player5 extends ManyFunctionalPlayer{

    public Player5(int price) {
        super(price);
        System.out.println("Объект Player5 создан");
    }

    @Override
    public void playSong() {
        System.out.println("Playing " + playlist[0]);
    }
    public void playAllSongs(){
        for (int i = playlist.length-1; i>=0; i--){
            System.out.println("Playing " + playlist[i]);
        }
    }
}
