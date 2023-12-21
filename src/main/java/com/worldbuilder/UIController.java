package com.worldbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UIController {
    @FXML
    private Label debugOut = new Label("hi");

    @FXML
    private TextField debugIn;


    public String getDebugIn() {
        String s_debugIn = debugIn.getText();
        return s_debugIn;
    }

    public void setDebugIn(String s_debugIn) {
        debugIn.setText(s_debugIn);
    }

    public String getDebugOut() {
        String s_debugOut = debugOut.getText();
        return s_debugOut;
    }

    public void setDebugOut(String s_debugOut) {
        debugOut.setText(s_debugOut);
    }
}