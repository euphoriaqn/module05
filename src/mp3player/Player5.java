package mp3player;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player5 extends ManyFunctionalPlayer{

    public Player5(int price) {
        super(price);
        System.out.println("Объект Player5 создан");
    }

    @Override
    public String playSong() {
        String playingSong = "Playing " + playlist[0];
        return playingSong;
    }
    public void playAllSongs(){
        for (int i = playlist.length-1; i>=0; i--){
            System.out.println("Playing " + playlist[i]);
        }
    }
    @Override
    public void show(Pane root) {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
