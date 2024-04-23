package com.worldbuilder;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Set;

public class World extends Category implements Serializable {
    // variables
    private static final long serialversionuid = 1l;
    private SecureRandom id = new SecureRandom();   // used to give individual numbers to each of the savedCategory and savedElements items
    private HashMap<Integer, Category> savedCategories = new HashMap<Integer, Category>();
    // variables end

    // methods
    /**
     * This lets you add a category to the world, saves them with individual Hash values using SecureRandom
     * @param aCategory
     */
    void addCategory(Category aCategory) {
        savedCategories.put(id.nextInt(), aCategory);
    }

    /**
     * @return reads a full HashMap of type Integer, Category from savedCategories
     */
    HashMap<Integer, Category> readAllCategories() {
        return savedCategories;
    }

    /**
     * @return Integer Set of saved Categories
     */
    Set<Integer> hashesCategories() {
        return savedCategories.keySet();
    }

    /**
     * @param aCategory enter the Element's id to remove from the HashMap
     */
    void removeCategory(Integer aCategory) {
        savedCategories.remove(aCategory);
    }
    // methods end

    // constructors
    /**
     * creates a hashmap with each Element getting assigned a random id - includes names and colors for itself
     * @id is a SecureRandom
     * @name is a simple name, can be freely chosen since the used key is id
     * @color is a simple hex code that's used to set and read a specific color
     * @savedCategories this is where each of World's objects of the Category type are saved
     * @savedElements this is where each of World's objects of the Element type are saved
     */
    World(String name) {
        super(name);
    }
    // constructors end
}
