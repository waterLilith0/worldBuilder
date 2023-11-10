package com.worldbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class uiController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}