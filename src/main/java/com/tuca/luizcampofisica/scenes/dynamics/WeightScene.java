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

public class WeightScene {

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

        TextField gravityAcceleration = new TextField("Digite aqui a aceleração da gravidade (m/s2)");
        gravityAcceleration.setTranslateX(300);
        gravityAcceleration.setTranslateY(1);
        gravityAcceleration.setMaxSize(50, 5);

        Text gravityAccelerationText = new Text("Digite aqui a aceleração da gravidade (m/s2)");
        gravityAccelerationText.setTranslateX(300);
        gravityAccelerationText.setTranslateY(-25);

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

            if (RegexVerifier.hasLetters(weight.getText()) || RegexVerifier.hasLetters(gravityAcceleration.getText())) {
                resultText.setText("Você precisa por números ao invés de letras.");
                return;
            }

            float weightNumber = Float.parseFloat(weight.getText());
            float gravityAccelerationNumber = Float.parseFloat(gravityAcceleration.getText());
            float result = (weightNumber * gravityAccelerationNumber);

            resultText.setText("Resultado: " + result + "m/s");


        });
        confirmationButton.setTranslateY(320);
        confirmationButton.setTranslateX(600);

        stackPane.getChildren().addAll(
                weight,
                weightText,


                gravityAcceleration,
                gravityAccelerationText,

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



