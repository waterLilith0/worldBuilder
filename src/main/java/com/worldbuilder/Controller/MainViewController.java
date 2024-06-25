package com.worldbuilder.Controller;

import com.worldbuilder.TreeViewList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainViewController {
    @FXML
    private TextArea t_write;
    @FXML
    private MenuBar mainMBar;
    @FXML
    private Menu mb_edit;
    @FXML
    private MenuItem mb_back;
    @FXML
    private MenuItem mb_save;
    @FXML
    private TreeView treeView;

    public void goBack(){

    }
    public void loadTree(){
        TreeViewList t = new TreeViewList();
        treeView.setRoot(t.getOrder());
    }
}
