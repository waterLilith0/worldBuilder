package com.worldbuilder;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Universe {
    private SecureRandom id = new SecureRandom();
    private String name;
    private int color;

    private ArrayList<Category> saved = new ArrayList<Category>();

    public void addSaved(Category savedIn) { // save a new item into the categories fitting to this universe, can also be a world
        saved.add(savedIn);
    }

    public void removeSaved(int catID) { // removes a certain element in the list by id
        for (int i = 0; i <= saved.size(); i++) {
            if (saved.get(i).equals(catID)) {
                saved.remove(i);
            }
        }
    }

    public int getCatID() {
        for (int i = 0; i <= saved.size(); i++) {
            return saved.get(i).catID;
        }
        return 0;
    }

    public ArrayList<Category> showCategories() { // shows the categories saved in an arraylist
        return saved;
    }
}
