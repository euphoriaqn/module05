package mp3player;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player1 extends MainMp3 {

        public Player1(int price) {
        super(price);
        System.out.println("Об'єкт Player1 создан ");
    }

    @Override
    public void show(Pane root) {

        Label label0 = new Label();
        label0.setTranslateX(240);
        label0.setTranslateY(10);
        label0.setText("MP3 PLAYER #1");
        label0.setFont(new Font("Courier New", 12));
        label0.setTextFill(Paint.valueOf("#ff0000"));

        Label label2 = new Label();
        label2.setTranslateX(180);
        label2.setTranslateY(180);
        label2.setText(Integer.toString(getPrice()) + "$");
        label2.setFont(new Font("Courier New", 12));

        Label label3 = new Label();
        label3.setTranslateX(180);
        label3.setTranslateY(210);
        label3.setText(playSong());
        label3.setFont(new Font("Courier New", 12));

        Button buttonToRed = new Button();
        buttonToRed.setTranslateX(20);
        buttonToRed.setTranslateY(180);
        buttonToRed.setPrefSize(150,20);
        buttonToRed.setText("Узнать цену плеера");

        Button buttonToGradient = new Button();
        buttonToGradient.setTranslateX(20);
        buttonToGradient.setTranslateY(210);
        buttonToGradient.setPrefSize(150,20);
        buttonToGradient.setText("Проиграть песню");

        buttonToRed.setOnMouseClicked(event -> {
            if (label2 != null) {
                root.getChildren().removeAll(label2);
            }
            root.getChildren().addAll(label2);
        });
        buttonToGradient.setOnMouseClicked(event -> {
            if (label2 != null) {
                root.getChildren().removeAll(label3);
            }
            root.getChildren().addAll(label3);
        });
        root.getChildren().addAll(label0, buttonToRed, buttonToGradient);
//
//        Scene scene = new Scene(root);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
