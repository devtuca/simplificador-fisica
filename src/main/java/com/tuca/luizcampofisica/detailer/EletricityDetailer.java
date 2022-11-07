package com.tuca.luizcampofisica.detailer;

import com.tuca.luizcampofisica.helpers.BackButtonCreater;
import com.tuca.luizcampofisica.helpers.LogoCreater;
import com.tuca.luizcampofisica.scenes.dynamics.ElasticForceScene;
import com.tuca.luizcampofisica.scenes.dynamics.FrictionalForceScene;
import com.tuca.luizcampofisica.scenes.dynamics.ResultantForceScene;
import com.tuca.luizcampofisica.scenes.dynamics.WeightScene;
import com.tuca.luizcampofisica.scenes.eletricity.EletrostaticForceScene;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EletricityDetailer {

    public static Scene scene;

    public static Scene getEletricityDetailer(Stage stage) {
        StackPane tilePane = new StackPane();
        scene = new Scene(tilePane, 1280, 679);
        scene.getStylesheets().add("com/tuca/velocidade/stylesheet.css");
        BackButtonCreater.createBackButton(stage, tilePane);
        LogoCreater.createLogo(tilePane);

        tilePane.setId("background-color");
        Button b1 = new Button("Força Eletrostática (N)");

        b1.setTranslateX(-450);
        b1.setOnAction(e -> {
            stage.setScene(EletrostaticForceScene.getElasticForceScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });


        Button b2 = new Button("Força Eletrostática (2)");
        b2.setTranslateX(-250);
        b2.setOnAction(e -> {
            stage.setScene(WeightScene.getElasticForceScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });


        Button b3 = new Button("Potencial Elétrico (V)");
        b3.setTranslateX(-50);
        b3.setOnAction(e -> {
            stage.setScene(ResultantForceScene.getElasticForceScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });


        Button b4 = new Button("Diferença de Potencial (V)");
        b4.setTranslateX(150);
        b4.setOnAction(e -> {
            stage.setScene(FrictionalForceScene.getFrictionalForceScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);

        });

        Button b5 = new Button("Potência Elétrica (W)");
        b5.setTranslateX(350);
        b5.setOnAction(e -> {
            stage.setScene(FrictionalForceScene.getFrictionalForceScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);

        });

        Button b6 = new Button("Potência Efeito Joule (J)");
        b6.setTranslateX(-250);
        b6.setTranslateY(50);
        b6.setOnAction(e -> {
            stage.setScene(FrictionalForceScene.getFrictionalForceScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);

        });

        Button b7 = new Button("Energia Elétrica (J/kWh)");
        b7.setTranslateX(-450);
        b7.setTranslateY(50);
        b7.setOnAction(e -> {
            stage.setScene(FrictionalForceScene.getFrictionalForceScene(stage));
            stage.setFullScreen(true);
            stage.setFullScreen(false);

        });

        tilePane.getChildren().addAll(b1, b2, b3, b4, b5, b6, b7);
        return scene;
    }
}




