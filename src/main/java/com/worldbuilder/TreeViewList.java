package com.worldbuilder;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.util.ArrayList;

public class TreeViewList {
    public TreeItem<String> getOrder() {
        Saving running = new Saving();

        ArrayList<Universe> universes = new ArrayList<>();
        for (int i = 0; i < running.getUniverses().size(); i++) {
            Universe a = (Universe) running.open(running.getUniverses().get(i));
            universes.add(a);
        }

        TreeItem<String> root = new TreeItem<>("Universes");
        for (Universe universe : universes) {
            TreeItem<String> treeItem = new TreeItem<>(universe.getName());
            root.getChildren().add(treeItem);

            ArrayList<Category> categories = new ArrayList<>();
            for (int i = 0; i < universe.getSavedCategories().size(); i++) {
                Category a = universe.getSavedCategories().get(i);
                categories.add(a);
            }

            for (Category category : categories) {
                TreeItem<String> c_treeItem = new TreeItem<>(category.getName());
                treeItem.getChildren().add(c_treeItem);
            }
        }
        return root;
    }
}
