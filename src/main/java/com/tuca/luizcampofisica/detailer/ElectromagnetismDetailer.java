package com.tuca.luizcampofisica.detailer;

import com.tuca.luizcampofisica.helpers.BackButtonCreater;
import com.tuca.luizcampofisica.helpers.LogoCreater;
import com.tuca.luizcampofisica.scenes.dynamics.ElasticForceScene;
import com.tuca.luizcampofisica.scenes.dynamics.FrictionalForceScene;
import com.tuca.luizcampofisica.scenes.dynamics.ResultantForceScene;
import com.tuca.luizcampofisica.scenes.dynamics.WeightScene;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ElectromagnetismDetailer {

    public static Scene scene;

    public static Scene getElectromagnetismDetailer(Stage stage) {
        StackPane tilePane = new StackPane();
        scene = new Scene(tilePane, 1280, 679);
        scene.getStylesheets().add("com/tuca/velocidade/stylesheet.css");
        BackButtonCreater.createBackButton(stage, tilePane);
        LogoCreater.createLogo(tilePane);

        tilePane.setId("background-color");
        Button b1 = new Button("Força Elástica");

        b1.setTranslateX(-450);
        b1.setOnAction(e -> {
            stage.setScene(ElasticForceScene.getElasticForceScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });


        Button b2 = new Button("Peso");
        b2.setTranslateX(-300);
        b2.setOnAction(e -> {
            stage.setScene(WeightScene.getElasticForceScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });



        Button b3 = new Button("Força Resultante");
        b3.setTranslateX(-150);
        b3.setOnAction(e -> {
            stage.setScene(ResultantForceScene.getElasticForceScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });


        Button b4 = new Button("Força de Atrito");
        b4.setTranslateX(0);
        b4.setOnAction(e -> {
            stage.setScene(FrictionalForceScene.getFrictionalForceScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);

        });
        tilePane.getChildren().addAll(b1, b2, b3, b4);
        return scene;
    }
}



