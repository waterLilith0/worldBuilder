package com.worldbuilder;

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
    }

    public static void main(String[] args) {
        Universe test = new Universe();
        Category testCat = new Category(1, "A");
        test.addSaved(testCat);
        World testWorld = new World(2, "B");
        test.addSaved(testWorld);
        System.out.println(test.showCategories());
        launch();
    }
}