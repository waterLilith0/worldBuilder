package com.worldbuilder.Controller;

import com.worldbuilder.Category;
import com.worldbuilder.MainExec;
import com.worldbuilder.Saving;
import com.worldbuilder.Universe;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class menueController{
    MainExec main = new MainExec();
    Saving saving = new Saving();
    @FXML
    private MenuButton menueButton;
    @FXML
    private Label l_title;
    @FXML
    private Button b_create;
    @FXML
    private VBox container;

    public void onB_create()throws Exception{
        main.showCreate();
    }

    public void loadUniverses(Saving location){
        /*for (Universe universe : saving.getUniverses()) {
            Button button = new Button("ID: " + universe.getId());
            container.getChildren().add(button);
        }*/
    }
    public void loadCategories(Universe location){
        HashMap<Integer, Category> c = location.getSavedCategories();
    }
    public void loadUniversesElements(Category location){

    }
}
