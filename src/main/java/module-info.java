module com.tuca.luizcampofisica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tuca.luizcampofisica to javafx.fxml;
    exports com.tuca.luizcampofisica;
}