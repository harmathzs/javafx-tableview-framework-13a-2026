package com.example.javafxtableviewframework13a2026;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TableController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}