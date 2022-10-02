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

public class MRUScene {

    private static StackPane stackPane;

    public static Scene getMRUScene(Stage stage) {
        stackPane = new StackPane();

        /*Velocidade Média*/

        TextField inicialSpace = new TextField("Digite aqui o espaço inicial.");
        inicialSpace.setTranslateX(-400);
        inicialSpace.setTranslateY(1);
        inicialSpace.setMaxSize(50, 5);

        Text inicialSpaceText = new Text("Digite aqui o espaço inicial.");
        inicialSpaceText.setTranslateX(-400);
        inicialSpaceText.setTranslateY(-25);

        TextField velocity = new TextField("Digite aqui a velocidade.");
        velocity.setTranslateX(1);
        velocity.setTranslateY(1);
        velocity.setMaxSize(50, 5);

        Text velocityText = new Text("Digite aqui a velocidade.");
        velocityText.setTranslateX(1);
        velocityText.setTranslateY(-25);

        TextField time = new TextField("Digite aqui o tempo.");
        time.setTranslateX(300);
        time.setTranslateY(1);
        time.setMaxSize(50, 5);

        Text timeText = new Text("Digite aqui o tempo.");
        timeText.setTranslateX(300);
        timeText.setTranslateY(-25);


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

            if (RegexVerifier.hasLetters(inicialSpace.getText()) || RegexVerifier.hasLetters(velocity.getText()) || RegexVerifier.hasLetters(time.getText())) {
                resultText.setText("Você precisa por números ao invés de letras.");
                return;
            }

            float inicialSpaceNumber = Float.parseFloat(inicialSpace.getText());
            float velocityNumber = Float.parseFloat(velocity.getText());
            float timeNumber = Float.parseFloat(time.getText());

            float result = (inicialSpaceNumber + velocityNumber * timeNumber);

            resultText.setText("Resultado: " + result + "m/s");


        });
        //confirmationButton.setTranslateY(320);
        //confirmationButton.setTranslateX(600);

        confirmationButton.setTranslateY(300);
        confirmationButton.setTranslateX(600);

        //340-600

        stackPane.getChildren().addAll(
                inicialSpace,
                inicialSpaceText,

                velocity,
                velocityText,

                time,
                timeText,

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

