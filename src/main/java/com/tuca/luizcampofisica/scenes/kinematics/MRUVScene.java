package com.tuca.luizcampofisica.scenes.kinematics;

import com.tuca.luizcampofisica.helpers.RegexVerifier;
import com.tuca.luizcampofisica.scenes.InicialScene;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class MRUVScene {

    private static StackPane stackPane;

    public static Scene getMRUVScene(Stage stage) {
        stackPane = new StackPane();

        /*Velocidade Média*/

        TextField inicialPosition = new TextField("Digite aqui a posição inicial do corpo.");
        inicialPosition.setTranslateX(-400);
        inicialPosition.setTranslateY(1);
        inicialPosition.setMaxSize(50, 5);

        Text inicialPositionText = new Text("Digite aqui a posição inicial do corpo.");
        inicialPositionText.setTranslateX(-400);
        inicialPositionText.setTranslateY(-25);


        TextField inicialVelocity = new TextField("Digite aqui a velocidade inicial.");
        inicialVelocity.setTranslateX(-100);
        inicialVelocity.setTranslateY(1);
        inicialVelocity.setMaxSize(50, 5);

        Text inicialVelocityText = new Text("Digite aqui a velocidade inicial.");
        inicialVelocityText.setTranslateX(-100);
        inicialVelocityText.setTranslateY(-25);


        TextField acceleration = new TextField("Digite aqui a aceleração.");
        acceleration.setTranslateX(200);
        acceleration.setTranslateY(1);
        acceleration.setMaxSize(50, 5);

        Text accelerationText = new Text("Digite aqui a aceleração");
        accelerationText.setTranslateX(200);
        accelerationText.setTranslateY(-25);


        TextField breaktime = new TextField("Digite aqui o intervalo de tempo.");
        breaktime.setTranslateX(400);
        breaktime.setTranslateY(1);
        breaktime.setMaxSize(50, 5);

        Text breaktimeText = new Text("Digite aqui o intervalo de tempo.");
        breaktimeText.setTranslateX(400);
        breaktimeText.setTranslateY(-25);

        Button backButton = new Button("Voltar");
        backButton.setOnAction(e -> {
            try {
                stage.setScene(InicialScene.getInicialScene(stage));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            stage.setFullScreen(true);
        });
        backButton.setTranslateY(305);
        backButton.setTranslateX(-610);

        Text resultText = new Text("Resultado: ");
        resultText.setTranslateX(280);
        resultText.setTranslateY(50);

        Button confirmationButton = new Button("Calcular");
        confirmationButton.setOnAction(e -> {

            if (
                    RegexVerifier.hasLetters(inicialPosition.getText()) ||
                            RegexVerifier.hasLetters(inicialVelocity.getText()) ||
                            RegexVerifier.hasLetters(acceleration.getText()) ||
                            RegexVerifier.hasLetters(breaktime.getText())

            ) {
                resultText.setText("Você precisa por números ao invés de letras.");
                return;
            }

            float inicialPositionNumber = Float.parseFloat(inicialPosition.getText());
            float inicialVelocityNumber = Float.parseFloat(inicialVelocity.getText());
            float accelerationNumber = Float.parseFloat(acceleration.getText());
            float breaktimeNumber = Float.parseFloat(breaktime.getText());

            float multiplyAcceleration =  (accelerationNumber * breaktimeNumber);
            float resultPow = (float) Math.pow(multiplyAcceleration, 2);
            float result = (inicialPositionNumber + inicialVelocityNumber * breaktimeNumber + resultPow / 2 );

            resultText.setText("Resultado: " + result + "m/s");


        });

        confirmationButton.setTranslateY(300);
        confirmationButton.setTranslateX(600);

        //340-600

        stackPane.getChildren().addAll(
                inicialPosition,
                inicialPositionText,

                inicialVelocity,
                inicialVelocityText,

                acceleration,
                accelerationText,

                breaktime,
                breaktimeText,

                backButton,
                confirmationButton,

                resultText
        );

        Scene scene = new Scene(stackPane, 1280, 670);
        stage.setFullScreen(true);
        stackPane.getStylesheets().add("com/tuca/velocidade/stylesheet.css");
        stackPane.setId("background-color");
        return scene;
    }
}

