package com.tuca.luizcampofisica.scenes.dynamics;

import com.tuca.luizcampofisica.helpers.RegexVerifier;
import com.tuca.luizcampofisica.scenes.InicialScene;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class ResultantForceScene {

    private static StackPane stackPane;

    public static Scene getElasticForceScene(Stage stage) {
        stackPane = new StackPane();

        TextField weight = new TextField("Digite aqui a massa (kg)");
        weight.setTranslateX(-400);
        weight.setTranslateY(1);
        weight.setMaxSize(50, 5);

        Text weightText = new Text("Digite aqui a massa (kg)");
        weightText.setTranslateX(-400);
        weightText.setTranslateY(-25);

        TextField acceleration = new TextField("Digite aqui a aceleração (m/s2)");
        acceleration.setTranslateX(300);
        acceleration.setTranslateY(1);
        acceleration.setMaxSize(50, 5);

        Text accelerationText = new Text("Digite aqui a aceleração (m/s2)");
        accelerationText.setTranslateX(300);
        accelerationText.setTranslateY(-25);

        Button backButton = new Button("Voltar");
        backButton.setOnAction(e -> {
            try {
                stage.setScene(InicialScene.getInicialScene(stage));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            stage.setFullScreen(true);
            stage.setFullScreen(false);
        });

        backButton.setTranslateY(315);
        backButton.setTranslateX(-610);

        Text resultText = new Text("Resultado: ");
        resultText.setTranslateX(280);
        resultText.setTranslateY(50);

        Button confirmationButton = new Button("Calcular");

        confirmationButton.setOnAction(e -> {

            if (RegexVerifier.hasLetters(weight.getText()) || RegexVerifier.hasLetters(acceleration.getText())) {
                resultText.setText("Você precisa por números ao invés de letras.");
                return;
            }

            float weightNumber = Float.parseFloat(weight.getText());
            float accelerationNumber = Float.parseFloat(acceleration.getText());
            float result = (weightNumber * accelerationNumber);

            resultText.setText("Resultado: " + result + "m/s");


        });
        confirmationButton.setTranslateY(320);
        confirmationButton.setTranslateX(600);

        stackPane.getChildren().addAll(
                weight,
                weightText,


                acceleration,
                accelerationText,

                backButton,
                confirmationButton,

                resultText
        );

        Scene scene = new Scene(stackPane, 1280, 670);
        stage.setFullScreen(true);
        stage.setFullScreen(false);
        stackPane.getStylesheets().add("com/tuca/velocidade/stylesheet.css");
        stackPane.setId("background-color");
        return scene;
    }

}



