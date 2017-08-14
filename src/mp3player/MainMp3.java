package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public abstract class MainMp3 implements ISong {
    String song1 = "The Best Song";
    final int price;

    public MainMp3(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
