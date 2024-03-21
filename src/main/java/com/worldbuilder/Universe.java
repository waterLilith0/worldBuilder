package com.worldbuilder;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Set;

public class Universe implements Serializable {
    // variables
    private SecureRandom id = new SecureRandom();
    private String name = "";
    private int color = 0;
    private HashMap<Integer, Category> savedCategories = new HashMap<Integer, Category>(); // sort categories with id
    // variables end

    // methods
    void addElement(Category aCategory) {
        savedCategories.put(id.nextInt(), aCategory);
    }

    HashMap<Integer, Category> readAllElements() {
        return savedCategories;
    }

    Set<Integer> hashes() {
        return savedCategories.keySet();
    }

    String getName() {
        return name;
    }
    // methods end
}
