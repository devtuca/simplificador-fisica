package com.tuca.luizcampofisica.scenes.dynamics;

import com.tuca.luizcampofisica.helpers.BackButtonCreater;
import com.tuca.luizcampofisica.helpers.RegexVerifier;
import com.tuca.luizcampofisica.scenes.InicialScene;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class ElasticForceScene {

    private static StackPane stackPane;

    public static Scene getElasticForceScene(Stage stage) {
        stackPane = new StackPane();

        TextField springElastic = new TextField("Digite aqui a elástica da mola (N/m)");
        springElastic.setTranslateX(-400);
        springElastic.setTranslateY(1);
        springElastic.setMaxSize(50, 5);

        Text springElasticText = new Text("Digite aqui a elástica da mola (N/m)");
        springElasticText.setTranslateX(-400);
        springElasticText.setTranslateY(-25);

        TextField springDeformation = new TextField("Digite aqui a deformação da mola (m)");
        springDeformation.setTranslateX(300);
        springDeformation.setTranslateY(1);
        springDeformation.setMaxSize(50, 5);

        Text springDeformationText = new Text("Digite aqui a deformação da mola (m)");
        springDeformationText.setTranslateX(300);
        springDeformationText.setTranslateY(-25);

        BackButtonCreater.createBackButton(stage, stackPane);

        Text resultText = new Text("Resultado: ");
        resultText.setTranslateX(280);
        resultText.setTranslateY(50);

        Button confirmationButton = new Button("Calcular");

        confirmationButton.setOnAction(e -> {

            if (RegexVerifier.hasLetters(springElastic.getText()) || RegexVerifier.hasLetters(springDeformation.getText())) {
                System.out.println("tem letras");
                resultText.setText("Você precisa por números ao invés de letras.");
                return;
            }

            float springElasticNumber = Float.parseFloat(springElastic.getText());
            float springDeformationNumber = Float.parseFloat(springDeformation.getText());
            float result = (springElasticNumber * springDeformationNumber);

            resultText.setText("Resultado: " + result + "m/s");


        });
        confirmationButton.setTranslateY(320);
        confirmationButton.setTranslateX(600);

        stackPane.getChildren().addAll(
                springDeformation,
                springDeformationText,


                springElastic,
                springElasticText,

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

