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
    private Label l_title;
    @FXML
    private Button b_create;
    @FXML
    private VBox container;

    public void onB_create()throws Exception{
        main.showCreate();
    }

    public void loadUniverses(){
        Saving location = new Saving();
        ArrayList<Universe> universes = new ArrayList<>();
        for (int i = 0; i < location.getUniverses().size(); i++) {
            Universe a = (Universe) location.open(location.getUniverses().get(i));
            universes.add(a);
        }
        for (Universe universe : universes) {
            Button button = new Button("" + universe.getName());
            container.getChildren().add(button);
        }
    }
    public void loadCategories(Universe location){
        HashMap<Integer, Category> c = location.getSavedCategories();
    }
    public void loadUniversesElements(Category location){}

}
