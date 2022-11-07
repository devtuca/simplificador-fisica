package com.tuca.luizcampofisica.helpers;

import com.tuca.luizcampofisica.scenes.InicialScene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class BackButtonCreater {

    public static Button button;

    public static void createBackButton(Stage stage, StackPane stackPane) {

        button = new Button("Voltar");
        button.setOnAction(e -> {
            try {
                stage.setScene(InicialScene.getInicialScene(stage));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        });
        button.setTranslateY(315);
        button.setTranslateX(-610);
        stackPane.getChildren().add(button);
    }
}