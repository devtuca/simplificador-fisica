package com.tuca.luizcampofisica.scenes.eletricity;

import com.tuca.luizcampofisica.helpers.BackButtonCreater;
import com.tuca.luizcampofisica.helpers.RegexVerifier;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EletrostaticForceScene {


    private static StackPane stackPane;

    public static Scene getElasticForceScene(Stage stage) {
        stackPane = new StackPane();

        TextField eletrostaticConsntant = new TextField("Digite aqui a constante eletrostática (N.M2/C2)");
        eletrostaticConsntant.setTranslateX(-400);
        eletrostaticConsntant.setTranslateY(1);
        eletrostaticConsntant.setMaxSize(50, 5);

        Text eletrostaticConsntantText = new Text("Digite aqui a constante eletrostática (N.M2/C2)");
        eletrostaticConsntantText.setTranslateX(-400);
        eletrostaticConsntantText.setTranslateY(-25);

        TextField moduleChargeOne = new TextField("Digite aqui o módulo da carga 1 (C)");
        moduleChargeOne.setTranslateX(300);
        moduleChargeOne.setTranslateY(1);
        moduleChargeOne.setMaxSize(50, 5);

        Text moduleChargeOneText = new Text("Digite aqui o módulo da carga 1 (C)");
        moduleChargeOneText.setTranslateX(300);
        moduleChargeOneText.setTranslateY(-25);

        TextField moduleChargeTwo = new TextField("Digite aqui o módulo da carga 2 (C)");
        moduleChargeTwo.setTranslateX(300);
        moduleChargeTwo.setTranslateY(1);
        moduleChargeTwo.setMaxSize(50, 5);

        Text moduleChargeTwoText = new Text("Digite aqui o módulo da carga 2 (C)");
        moduleChargeTwoText.setTranslateX(300);
        moduleChargeTwoText.setTranslateY(-25);

        BackButtonCreater.createBackButton(stage, stackPane);

        Text resultText = new Text("Resultado: ");
        resultText.setTranslateX(280);
        resultText.setTranslateY(50);

        Button confirmationButton = new Button("Calcular");

        confirmationButton.setOnAction(e -> {

            if (RegexVerifier.hasLetters(eletrostaticConsntant.getText())
                    || RegexVerifier.hasLetters(moduleChargeOne.getText())
                    || RegexVerifier.hasLetters(moduleChargeTwo.getText())
            ) {

                resultText.setText("Você precisa por números ao invés de letras.");
                return;
            }

            float springElasticNumber = Float.parseFloat(eletrostaticConsntant.getText());
            float springDeformationNumber = Float.parseFloat(moduleChargeOne.getText());
            float result = (springElasticNumber * springDeformationNumber);

            resultText.setText("Resultado: " + result + "m/s");


        });
        confirmationButton.setTranslateY(320);
        confirmationButton.setTranslateX(600);

        stackPane.getChildren().addAll(
                eletrostaticConsntant,
                eletrostaticConsntantText,


                moduleChargeOne,
                moduleChargeOneText,

                moduleChargeTwo,
                moduleChargeTwoText,

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



