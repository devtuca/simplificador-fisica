package com.tuca.luizcampofisica.scenes;

import com.tuca.luizcampofisica.detailer.DynamicDetailer;
import com.tuca.luizcampofisica.detailer.ElectromagnetismDetailer;
import com.tuca.luizcampofisica.detailer.EletricityDetailer;
import com.tuca.luizcampofisica.helpers.BackButtonCreater;
import com.tuca.luizcampofisica.helpers.LogoCreater;
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

        LogoCreater.createLogo(tilePane);

        tilePane.setId("background-color");
        Button b1 = new Button("Dinâmica");

        b1.setTranslateX(-450);
        b1.setOnAction(e -> {
            stage.setScene(DynamicDetailer.getDynamicDetailer(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });


        Button b2 = new Button("Eletromagnetismo");
        b2.setTranslateX(-300);
        b2.setOnAction(e -> {
            stage.setScene(ElectromagnetismDetailer.getElectromagnetismDetailer(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });


        Button b3 = new Button("Eletricidade");
        b3.setTranslateX(-150);
        b3.setOnAction(e -> {
            stage.setScene(EletricityDetailer.getEletricityDetailer(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });


        Button b4 = new Button("Gravitação Universal");
        b4.setTranslateX(0);


        Button b5 = new Button("Impulso");
        b5.setTranslateX(150);


        Button b6 = new Button("Movimento");
        b6.setTranslateX(300);


        Button b7 = new Button("Cinemática");
        b7.setTranslateX(450);


        Button b8 = new Button("Ondas");
        b8.setTranslateX(-450);


        Button b9 = new Button("Ótica");
        b9.setTranslateX(-300);


        Button b10 = new Button("Termologia");
        b10.setTranslateX(-150);


        Button b11 = new Button("Termodinâmica");
        b11.setTranslateX(0);


        Button b12 = new Button("Força");
        b12.setTranslateX(150);


        Button b13 = new Button("Energia");
        b13.setTranslateX(300);


        Button b14 = new Button("Pressão");
        b14.setTranslateX(450);


        Button b15 = new Button("Quan. Movimento");

        setFirstFloor(b1, b2, b3, b4, b5, b6, b7);
        setSecondFloor(b8, b9, b10, b11, b12, b13, b14);
        setThreeFloor(b15);
        scene.setFill(Color.AQUA);

        tilePane.getChildren().addAll(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
                b11, b12, b13, b14, b15);
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