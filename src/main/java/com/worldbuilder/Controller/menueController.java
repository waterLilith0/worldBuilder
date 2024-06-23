package com.worldbuilder.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class menueController{
    @FXML
    private MenuButton menueButton;

    @FXML
    private Button b_create;
     Stage stage = new Stage();

    public void onB_create(ActionEvent event)throws Exception {
        /*Parent loader = FXMLLoader.load(getClass().getResource("Create.fxml"));
        Scene scene = new Scene(loader);
        stage.setScene(scene);
        stage.show();*/
    }
}
