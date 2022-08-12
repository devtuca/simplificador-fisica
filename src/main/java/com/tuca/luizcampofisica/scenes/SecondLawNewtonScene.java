package com.tuca.luizcampofisica.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class SecondLawNewtonScene {

    private static StackPane stackPane;

    public static Scene getVelocityScene(Stage stage) {
        stackPane = new StackPane();

        /*Velocidade Média*/
        TextField velocityMedium = new TextField("Digite aqui a velocidade média.");
        velocityMedium.setTranslateX(-400);
        velocityMedium.setTranslateY(1);
        velocityMedium.setMaxSize(50, 5);

        Text velocityMediumText = new Text("Digite aqui a velocidade média.");
        velocityMediumText.setTranslateX(-400);
        velocityMediumText.setTranslateY(-25);




        /*Variação de espaço*/
        TextField spaceVariation = new TextField("Digite aqui a variação de espaço.");
        spaceVariation.setTranslateX(1);
        spaceVariation.setTranslateY(1);
        spaceVariation.setMaxSize(50, 5);

        Text spaceVariationText = new Text("Digite aqui a variação do espaço.");
        spaceVariationText.setTranslateX(1);
        spaceVariationText.setTranslateY(-25);

        /*Variação do Tempo*/


        TextField timeVariation = new TextField("Digite aqui a variação de tempo.");
        timeVariation.setTranslateX(300);
        timeVariation.setTranslateY(1);
        timeVariation.setMaxSize(50, 5);

        Text timeVariationText = new Text("Digite aqui a velocidade média.");
        timeVariationText.setTranslateX(300);
        timeVariationText.setTranslateY(-25);

        Button backButton = new Button("Voltar");
        backButton.setOnAction(e -> {
            try {
                stage.setScene(InicialScene.getInicialScene(stage));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            stage.setFullScreen(true);
        });
        backButton.setTranslateY(345);
        backButton.setTranslateX(-610);

        Text result = new Text("Resultado: ");
        result.setTranslateX(300);
        result.setTranslateY(50);

        Button confirmationButton = new Button("Calcular");
        confirmationButton.setOnAction(e -> {
            result.setText("Resultado: " + velocityMedium.getText());
        });
        confirmationButton.setTranslateY(340);
        confirmationButton.setTranslateX(600);


        stackPane.getChildren().addAll(
                velocityMediumText,
                velocityMedium,

                spaceVariation,
                spaceVariationText,

                timeVariation,
                timeVariationText,

                backButton,
                confirmationButton,

                result
        );

        Scene scene = new Scene(stackPane, 700, 700);
        stage.setFullScreen(true);
        return scene;
    }
}


