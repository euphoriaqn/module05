package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class Main {
    public static void main(String[] args){
        Player1 p1 = new Player1(100);
        int price = p1.getPrice();
        System.out.println("His price " + price);

        Player2 p2 = new Player2(150);
        p2.playSong();

        Player3 p3 = new Player3(200);
        p3.playAllSongs();


        Player4 p4 = new Player4(400);
        p4.playAllSongs();

        Player5 p5 = new Player5(500);
        p5.playAllSongs();

        Player6 p6 = new Player6(600);
        p6.shuffle();
        p6.playAllSongs();
    }
}
