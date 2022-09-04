package com.tuca.luizcampofisica;

import com.tuca.luizcampofisica.scenes.InicialScene;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileNotFoundException;


public class CalculatorController extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        stage.setScene(InicialScene.getInicialScene(stage));
        stage.getScene().getStylesheets().add("com/tuca/velocidade/stylesheet.css");
        stage.getIcons().add(new Image("com/tuca/velocidade/icon.png"));
        stage.setTitle("Simplificador de Física");
        stage.show();
        stage.setFullScreen(true);
        stage.setFullScreen(false);
    }

     public static void main(String[] args) {
        launch(args);
    }
}