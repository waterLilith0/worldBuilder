package com.worldbuilder;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class mainExec extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("debugging.fxml"));
        Scene scene = new Scene(fxmlLoader, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        uiController test = new uiController();
        test.setDebugOut("T-T");

        System.out.println(test.getDebugOut());
    }

    public static void main(String[] args) {
        launch();
    }
}