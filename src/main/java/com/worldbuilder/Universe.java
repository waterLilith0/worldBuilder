package com.worldbuilder;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Universe {
    // variables
    private SecureRandom id = new SecureRandom();
    private String name = "";
    private int color = 0;
    private ArrayList<Category> saved = new ArrayList<Category>();
    // variables end

    // methods
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

    public int[] getCatID() {
        int[] temp = new int[saved.size()];
        for (int i = 0; i <= temp.length - 1; i++) {
            temp[i] = saved.get(i).getCatID();
        }
        return temp;
    }

    public ArrayList<Category> showCategories() { // shows the categories saved in an arraylist
        return saved;
    }
    // methods end
}
