package com.tuca.luizcampofisica.scenes;

import com.tuca.luizcampofisica.scenes.kinematics.MRUScene;
import com.tuca.luizcampofisica.scenes.kinematics.MRUVScene;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class InicialScene {

    public static Scene scene;

    public static Scene getInicialScene(Stage stage) throws FileNotFoundException {
        StackPane tilePane = new StackPane();
        scene = new Scene(tilePane, 1280, 679);
        scene.getStylesheets().add("com/tuca/velocidade/stylesheet.css");

        Image image = new Image("com/tuca/velocidade/simplificador.png");

        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setTranslateX(1);
        imageView.setTranslateY(-250);
        imageView.setFitWidth(575);
        imageView.setPreserveRatio(true);

        tilePane.setId("background-color");
        Button b1 = new Button("Velocidade Média");

        b1.setTranslateX(-450);
        b1.setOnAction(e -> {
            stage.setScene(VelocityMediumScene.getVelocityMediumScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });


        Button b2 = new Button("MRU");
        b2.setTranslateX(-300);
        b2.setOnAction(e -> {
            stage.setScene(MRUScene.getMRUScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });


        Button b3 = new Button("MRUV");
        b3.setTranslateX(-150);
        b3.setOnAction(e -> {
            stage.setScene(MRUVScene.getMRUVScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });


        Button b4 = new Button("MCU");
        b4.setTranslateX(0);


        Button b5 = new Button("L.O");
        b5.setTranslateX(150);


        Button b6 = new Button("Dinâmica");
        b6.setTranslateX(300);


        Button b7 = new Button("T.E.P");
        b7.setTranslateX(450);


        Button b8 = new Button("I.Q.M");
        b8.setTranslateX(-450);


        Button b9 = new Button("Hidrostática");
        b9.setTranslateX(-300);


        Button b10 = new Button("Gravitãção U.");
        b10.setTranslateX(-150);


        Button b11 = new Button("Escalas Térm.");
        b11.setTranslateX(0);


        Button b12 = new Button("Dilatação Térm.");
        b12.setTranslateX(150);


        Button b13 = new Button("Refração");
        b13.setTranslateX(300);


        Button b14 = new Button("Calorimetria");
        b14.setTranslateX(450);


        Button b15 = new Button("Termodinâmica");
        b15.setTranslateX(-450);


        Button b16 = new Button("Eletrostática");
        b16.setTranslateX(-300);


        Button b17 = new Button("Espelhos Esf.");
        b17.setTranslateX(-150);

        setFirstFloor(b1, b2, b3, b4, b5, b6, b7);
        setSecondFloor(b8, b9, b10, b11, b12, b13, b14);
        setThreeFloor(b15, b16, b17);
        scene.setFill(Color.AQUA);

        tilePane.getChildren().addAll(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
                b11, b12, b13, b14, b15, b16, b17, imageView);
        //stage.setFullScreen(true);
        return scene;
    }

    private static void setFirstFloor(Button... firstFloor) {
        for (Button button : firstFloor) {
            button.setTranslateY(1);
        }
    }

    private static void setSecondFloor(Button... secondFloor) {
        for (Button button : secondFloor) {
            button.setTranslateY(80);
        }
    }

    private static void setThreeFloor(Button... threeFloor) {
        for (Button button : threeFloor) {
            button.setTranslateY(160);
        }
    }
}