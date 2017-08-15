package mp3player;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * Created by user22 on 10.08.2017.
 */
public class Main extends Application {
    private Pane root = new Pane();
    Label label;
    Button button;
    TextField countField1;
    public static void main(String[] args){
//        Player1 p1 = new Player1(100);
//        int price = p1.getPrice();
//        System.out.println("His price " + price);
//
//        Player2 p2 = new Player2(150);
//        p2.playSong();
//
//        Player3 p3 = new Player3(200);
//        p3.playAllSongs();
//
//
//        Player4 p4 = new Player4(400);
//        p4.playAllSongs();
//
//        Player5 p5 = new Player5(500);
//        p5.playAllSongs();
//
//        Player6 p6 = new Player6(600);
//        p6.shuffle();
//        p6.playAllSongs();
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setWidth(600);
        primaryStage.setHeight(700);
        Label label = new Label();
        label.setTranslateX(20);
        label.setTranslateY(20);
        label.setText("Введіть номер плеєру");
        label.setFont(new Font("Courier New", 12));

        TextField countField1 = new TextField();
        countField1.setTranslateX(10);
        countField1.setTranslateY(35);
        countField1.setText("10");

        Button button = new Button();
        button.setTranslateX(20);
        button.setTranslateY(150);
        button.setPrefSize(150,20);
        button.setText("Завантажити плеєр");

        button.setOnMouseClicked(event -> {
            int choice = Integer.parseInt(countField1.getText());
            root.getChildren().removeAll(button, label, countField1);
            switch(choice) {
                case 1:
                    Player1 p1 = new Player1(100);
                    p1.show(root);
                    break;
                case 2:
                    Player2 p2 = new Player2(300);
                    p2.show(root);
                    break;
                case 3:
                    Player3 p3 = new Player3(300);
                    p3.show(root);
                    break;
                case 4:
                    Player4 p4 = new Player4(300);
                    p4.show(root);
                    break;
                case 5:
                    Player5 p5 = new Player5(300);
                    p5.show(root);
                    break;
                case 6:
                    Player5 p6 = new Player5(300);
                    p6.show(root);
                    break;
            }

        });
        root.getChildren().addAll(button, label, countField1);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();


        }
    }
