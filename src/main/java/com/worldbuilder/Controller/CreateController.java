package com.worldbuilder.Controller;

import com.worldbuilder.MainExec;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CreateController {
    MainExec mainExec;
    @FXML
    private RadioButton universe;
    @FXML
    private RadioButton world;
    @FXML
    private RadioButton category;
    @FXML
    private RadioButton element;
    @FXML
    private TextField t_name;
    @FXML
    private Label l_info;

    private ToggleGroup types = new ToggleGroup();

    public void closeS(){
        if (mainExec != null) {
            System.out.println("Requesting to close create stage");
            mainExec.closeCreate();
        } else {
            System.err.println("mainExec is null!");
        }
    }
    public void setMainExec(MainExec mainExec) {
        this.mainExec = mainExec;
    }
    public void inGroup(){
        universe.setToggleGroup(types);
        world.setToggleGroup(types);
        category.setToggleGroup(types);
        element.setToggleGroup(types);
    }

    public void saveNew(){
        String name = t_name.getText();
        if(name!=null) {
            if (types.getSelectedToggle() != null) {
                if(universe.isSelected()) {

                } else if (world.isSelected()) {

                } else if (category.isSelected()) {

                } else if (element.isSelected()) {

                }
            }else{
                l_info.setText("Choose a type");
            }
        }else{
            l_info.setText("Enter Name");
        }
    }

    public String getT_name() {
        return t_name.getText();
    }
}
