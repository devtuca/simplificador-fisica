package com.tuca.luizcampofisica.helpers;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LogoCreater {

    public static void createLogo(StackPane stackPane) {
        Image image = new Image("com/tuca/velocidade/simplificador.png");

        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setTranslateX(1);
        imageView.setTranslateY(-250);
        imageView.setFitWidth(575);
        imageView.setPreserveRatio(true);
        stackPane.getChildren().add(imageView);
    }
}
