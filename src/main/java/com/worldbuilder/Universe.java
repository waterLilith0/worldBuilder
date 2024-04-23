package com.worldbuilder;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Set;

public class Universe implements Serializable {
    // variables
    private static final long serialversionuid = 1l;
    private SecureRandom id = new SecureRandom();   // used to give individual numbers to each of the savedCategory items
    private String name = "";
    private int color = 0;
    private HashMap<Integer, Category> savedCategories = new HashMap<Integer, Category>(); // sort categories with id
    // variables end

    // methods
    /**
     * This lets you add a category or world to the universe, saves them with individual Hash values using SecureRandom
     * @param aCategory
     */
    void addCategory(Category aCategory) {
        savedCategories.put(id.nextInt(), aCategory);
    }

    /**
     * @return reads a full HashMap of type Integer, Category from savedCategories
     */
    public HashMap<Integer, Category> getSavedCategories() {
        return savedCategories;
    }

    /**
     * @param aCategoryId enter the Category's id to remove from the HashMap
     */
    void removeCategory(int aCategoryId) {
        savedCategories.remove(aCategoryId);
    }

    /**
     * @return Integer Set of saved categories
     */
    public Set<Integer> hashes() {
        return savedCategories.keySet();
    }

    /**
     * @return reads name of Universe as String
     */
    String getName() {
        return name;
    }

    /**
     * @return reads color of Universe as integer hex code
     */
    public int getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(int color) {
        this.color = color;
    }
    // methods end

    // constructor
    /**
     * creates a hashmap with each Category getting assigned a random id - includes names and colors for itself
     * @id is a SecureRandom
     * @name is a simple name, can be freely chosen since the used key is id
     * @color is a simple hex code that's used to set and read a specific color
     * @savedCategories this is where each of Universe's objects of the Category/World type are saved
     */
    Universe() {}

    /**
     * creates a hashmap with each category getting assigned a random id - includes names and colors for itself
     * @id is an identifying id, specific to each object of Universe
     * @name is a simple name that's also used in the actual filename
     * @color is a simple hex code that's used to set and read a specific color
     * @savedCategories this is where each of Universe's objects of the Category/World type are saved
     */
    Universe(String universeName) {
        this.name = universeName;
    }
    // constructor end
}
