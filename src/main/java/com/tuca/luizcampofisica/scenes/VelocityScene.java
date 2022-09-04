package com.tuca.luizcampofisica.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class VelocityScene {

    private static StackPane stackPane;

    public static Scene getVelocityScene(Stage stage) {
        stackPane = new StackPane();

        /*Velocidade Média*/
        TextField timeVariationText = new TextField("Digite aqui a variação de tempo.");
        timeVariationText.setTranslateX(-400);
        timeVariationText.setTranslateY(1);
        timeVariationText.setMaxSize(50, 5);

        Text timeVariation = new Text("Digite aqui a variação de tempo.");
        timeVariation.setTranslateX(-400);
        timeVariation.setTranslateY(-25);


        /*Variação do Tempo*/


        TextField spaceVariation = new TextField("Digite aqui a variação de espaço.");
        spaceVariation.setTranslateX(300);
        spaceVariation.setTranslateY(1);
        spaceVariation.setMaxSize(50, 5);

        Text spaceVariationText = new Text("Digite aqui a variação de espaço.");
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
            Integer timeVariationNumber = Integer.parseInt(timeVariation.getText());
            Integer spaceVariationNumber = Integer.parseInt(spaceVariation.getText());

            int result = (timeVariationNumber / spaceVariationNumber);
            System.out.println(timeVariationNumber);
            System.out.println(spaceVariationNumber);

            resultText.setText("Resultado: " + result + "m/s");
            confirmationButton.setTranslateY(320);
            confirmationButton.setTranslateX(600);
        });


        stackPane.getChildren().addAll(
                spaceVariation,
                spaceVariationText,


                timeVariation,
                timeVariationText,

                backButton,
                confirmationButton,

                resultText
        );

        Scene scene = new Scene(stackPane, 1000, 1000);
        stage.setFullScreen(true);
        stage.setFullScreen(false);
        scene.setFill(Color.web("#2E2D37"));
        return scene;
    }
}