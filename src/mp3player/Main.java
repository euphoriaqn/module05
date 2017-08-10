package mp3player;

/**
 * Created by user22 on 10.08.2017.
 */
public class Main {
    public static void main(String[] args){
        Player1 p1 = new Player1(100);
        int price = p1.getPrice();
        System.out.println("His price " + price);

        Player3 p3 = new Player3(200);
        p3.playlistPlayer3.playAllSongs();


        Player4 p4 = new Player4(400);
        p4.playlistPlayer4.playAllSongs();
    }
}
