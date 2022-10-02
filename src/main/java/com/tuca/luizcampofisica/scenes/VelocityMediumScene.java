package com.tuca.luizcampofisica.scenes;

import com.tuca.luizcampofisica.helpers.RegexVerifier;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class VelocityMediumScene {

    private static StackPane stackPane;

    public static Scene getVelocityMediumScene(Stage stage) {
        stackPane = new StackPane();

        TextField timeVariation = new TextField("Digite aqui a variação de tempo.");
        timeVariation.setTranslateX(-400);
        timeVariation.setTranslateY(1);
        timeVariation.setMaxSize(50, 5);

        Text timeVariationText = new Text("Digite aqui a variação de tempo. (s)");
        timeVariationText.setTranslateX(-400);
        timeVariationText.setTranslateY(-25);

        TextField spaceVariation = new TextField("Digite aqui a variação de espaço.");
        spaceVariation.setTranslateX(300);
        spaceVariation.setTranslateY(1);
        spaceVariation.setMaxSize(50, 5);

        Text spaceVariationText = new Text("Digite aqui a variação de espaço. (m)");
        spaceVariationText.setTranslateX(300);
        spaceVariationText.setTranslateY(-25);

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

            if (RegexVerifier.hasLetters(timeVariation.getText()) || RegexVerifier.hasLetters(spaceVariation.getText())) {
                System.out.println("tem letras");
                resultText.setText("Você precisa por números ao invés de letras.");
                return;
            }

            float timeVariationNumber = Float.parseFloat(timeVariation.getText());
            float spaceVariationNumber = Float.parseFloat(spaceVariation.getText());
            float result = (timeVariationNumber / spaceVariationNumber);

            resultText.setText("Resultado: " + result + "m/s");


        });
        confirmationButton.setTranslateY(320);
        confirmationButton.setTranslateX(600);

        stackPane.getChildren().addAll(
                spaceVariation,
                spaceVariationText,


                timeVariation,
                timeVariationText,

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
