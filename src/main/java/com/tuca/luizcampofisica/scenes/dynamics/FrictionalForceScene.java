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

public class FrictionalForceScene {


    private static StackPane stackPane;

    public static Scene getFrictionalForceScene(Stage stage) {

        stackPane = new StackPane();

        TextField frictionCoefficient = new TextField("Digite aqui o coeficiente de átrito");
        frictionCoefficient.setTranslateX(-400);
        frictionCoefficient.setTranslateY(1);
        frictionCoefficient.setMaxSize(50, 5);

        Text frictionCoefficientText = new Text("Digite aqui o coeficiente de átrito");
        frictionCoefficientText.setTranslateX(-400);
        frictionCoefficientText.setTranslateY(-25);

        TextField force = new TextField("Digite aqui a força normal");
        force.setTranslateX(300);
        force.setTranslateY(1);
        force.setMaxSize(50, 5);

        Text forceText = new Text("Digite aqui a força normal");
        forceText.setTranslateX(300);
        forceText.setTranslateY(-25);

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

            if (RegexVerifier.hasLetters(frictionCoefficient.getText()) || RegexVerifier.hasLetters(force.getText())) {

                resultText.setText("Você precisa por números ao invés de letras.");
                return;
            }

            float frictionCoefficientNumber = Float.parseFloat(frictionCoefficient.getText());
            float forceNumber = Float.parseFloat(force.getText());
            float result = (frictionCoefficientNumber * forceNumber);

            resultText.setText("Resultado: " + result + "m/s");


        });
        confirmationButton.setTranslateY(320);
        confirmationButton.setTranslateX(600);

        stackPane.getChildren().addAll(
                frictionCoefficient,
                frictionCoefficientText,


                force,
                forceText,

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

