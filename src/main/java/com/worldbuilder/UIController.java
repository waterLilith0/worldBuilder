package com.worldbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UIController {
    @FXML
    private Label debugOut = new Label("init");

    @FXML
    private TextField debugIn;


    public String getDebugIn() {
        String s_debugIn = debugIn.getText();
        return s_debugIn;
    }

    public void setDebugIn(String s_debugIn) {
        debugIn.setText(s_debugIn);
    }

    @FXML
    public void initialize() {
        debugOut.setText("Initialized");
    }
}