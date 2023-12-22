package com.worldbuilder;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainExec extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("debugging.fxml"));
        Scene scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();

        UIController test = new UIController();
    }

    public static void main(String[] args) {
        launch();
    }
}