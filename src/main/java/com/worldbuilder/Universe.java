/*
creates a hashmap with each category getting assigned a random id
includes names and colors for itself
 */

package com.worldbuilder;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Set;

public class Universe implements Serializable {
    // variables
    private static final long serialversionuid = 1l;
    private SecureRandom id = new SecureRandom();
    private String name = "";
    private int color = 0;
    private HashMap<Integer, Category> savedCategories = new HashMap<Integer, Category>(); // sort categories with id
    // variables end

    // methods
    void addCategory(Category aCategory) {
        savedCategories.put(id.nextInt(), aCategory);
    }

    public Set<Integer> hashes() {
        return savedCategories.keySet();
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public HashMap<Integer, Category> getSavedCategories() {
        return savedCategories;
    }

    public int getColor() {
        return color;
    }
    // methods end

    // constructor
    Universe() {
    }

    Universe(String universeName) {
        this.name = universeName;
    }
    // constructor end
}
